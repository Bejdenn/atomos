package com.elinis.projectteacher.client.login;

import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import main.Datenbank;

public class Login extends VBox {

	private TextField loginUsernameField;
	private PasswordField loginPasswordField;
	private PasswordField loginRepeatedPasswordField;
	private Button loginSignInButton;
	private Button loginRegisterButton;
	private Datenbank db;

	public Login() {
		this.createLoginWindow();
	}

	private void createLoginWindow() {
		this.setPadding(new Insets(100, 100, 100, 100));
		this.setSpacing(35);

		loginUsernameField = new TextField();
		loginUsernameField.setPromptText("Benutzername");

		loginPasswordField = new PasswordField();
		loginPasswordField.setPromptText("Passwort");

		loginSignInButton = new Button("Anmelden");
		loginRegisterButton = new Button("Registieren");

		HBox loginButtons = new HBox();
		loginButtons.setSpacing(50);
		loginButtons.getChildren().addAll(loginSignInButton, loginRegisterButton);

		this.getChildren().addAll(loginUsernameField, loginPasswordField, loginButtons);

		loginSignInButton.setOnAction(e -> {
			this.performLogin();
		});

		loginRegisterButton.setOnAction(e -> {
			this.createRegisterWindow();
		});
	}

	private void createRegisterWindow() {
		this.setPadding(new Insets(100, 100, 100, 100));
		this.setSpacing(35);

		loginUsernameField = new TextField();
		loginUsernameField.setPromptText("Benutzername");

		loginPasswordField = new PasswordField();
		loginPasswordField.setPromptText("Passwort");

		loginRepeatedPasswordField = new PasswordField();
		loginRepeatedPasswordField.setPromptText("Passwort wiederholen");

		loginRegisterButton = new Button("Registieren");

		loginRegisterButton.setOnAction(e -> {
			this.performRegistration();
		});
	}

	private void performLogin() {
		String username = loginUsernameField.getText();
		String password = loginPasswordField.getText();
		String hp;
		ArrayList<String> al = new ArrayList<String>();
		ArrayList<String> al2 = new ArrayList<String>();

		boolean stimmt = false;

		try {
			password = HashPassword.hashPassword(password);
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		al = db.datenAbfragen("select email from user");
		al2 = db.datenAbfragen("select password from user");

		for (String entries : al) {
			if (entries.equals(username) && entries.equals(password)) {
				stimmt = true;
			} else {
				stimmt = false;
			}
		}

		if (stimmt == true) {
			System.out.println("It worked");
		}

		else {
			DOptionPane.showError("Login fehlgeschlagen", "Benutzername oder Passwort sind falsch.");
			loginUsernameField.setText("");
			loginPasswordField.setText("");
		}
	}

	private void performRegistration() {

		String username = loginUsernameField.getText();
		String password = loginPasswordField.getText();
		String repeatedPassword = loginRepeatedPasswordField.getText();

		ArrayList<String> emailList = new ArrayList<String>();

		emailList = db.datenAbfragen("SELECT EMAIL FROM USER");

		if (username.matches("[\\@.]")) {
			DOptionPane.showError("Fehler", "Ihre Eingabe entspricht keiner richtigen E-Mail Adresse!");
			loginPasswordField.setText("");
			loginRepeatedPasswordField.setText("");
			return;
		}

		if (emailList.contains(username) == true) {
			DOptionPane.showError("Fehler", "Dieser Benutzername ist bereits vergeben!");
			loginUsernameField.setText("");
			loginPasswordField.setText("");
			loginRepeatedPasswordField.setText("");
			return;
		}

		if (username.length() < 8) {
			DOptionPane.showError("Fehler", "Das Passwort ist zu kurz! Es muss mindestens 8 Zeichen lang sein!");
			loginPasswordField.setText("");
			loginRepeatedPasswordField.setText("");
			return;
		}

		if (!password.equals(repeatedPassword)) {
			DOptionPane.showError("Fehler", "Die Passwörter stimmen nicht überein!");
			loginPasswordField.setText("");
			loginRepeatedPasswordField.setText("");
			return;
		}
//<3
		try {
			password = HashPassword.hashPassword(password);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		db.befehlAusfuehren("INSERT INTO user ([right], password, email, id) VALUES ('Yes', '" + password + "', '"
				+ username + "'");

		System.out.println("Successful!");
	}
}
