package projectTeacher;

import java.util.ArrayList;
import java.util.List;

import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class Login extends VBox {

	TextField usernameInputField = new TextField();
	PasswordField passwordInputField = new PasswordField();
	PasswordField repeatPasswordInputField = new PasswordField();
	Button loginButton = new Button("Anmelden");
	Button registerButton = new Button("Registieren");
	List<Node> componentList = new ArrayList<Node>();

	private Datenbank db;

	public Login() {
		this.setPadding(new Insets(25, 25, 25, 25));
		this.setSpacing(25);

		componentList.add(usernameInputField);
		componentList.add(passwordInputField);
		componentList.add(loginButton);
		componentList.add(registerButton);

		this.getChildren().addAll(componentList);

		loginButton.setOnAction(e -> {

		});

		registerButton.setOnAction(e -> {

		});
	}

}

//	private void performLogin() {
//		String username = usernameInputField.getText();
//		String password = passwordInputField.getText();
//		String hp;
//		ArrayList<String> al = new ArrayList<String>();
//		ArrayList<String> al2 = new ArrayList<String>();
//
//		boolean stimmt = false;
//
//		try {
//			password = HashPassword.hashPassword(password);
//		} catch (NoSuchAlgorithmException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		al = db.datenAbfragen("select email from user");
//		al2 = db.datenAbfragen("select password from user");
//
//		for (String entries : al) {
//			if (entries.equals(username) && entries.equals(password)) {
//				stimmt = true;
//			} else {
//				stimmt = false;
//			}
//		}
//
//		if (stimmt == true) {
//			System.out.println("It worked");
//		}
//
//		else {
//			DOptionPane.showError("Login fehlgeschlagen", "Benutzername oder Passwort sind falsch.");
//			usernameInputField.setText("");
//			passwordInputField.setText("");
//		}
//	}
//
//	private void performRegistration() {
//
//		String username = usernameInputField.getText();
//		String password = passwordInputField.getText();
//		String repeatedPassword = repeatPasswordInputField.getText();
//
//		ArrayList<String> emailList = new ArrayList<String>();

//		emailList = db.datenAbfragen("SELECT EMAIL FROM USER");
//
//		if (username.matches("[\\@.]")) {
//			DOptionPane.showError("Fehler", "Ihre Eingabe entspricht keiner richtigen E-Mail Adresse!");
//			passwordInputField.setText("");
//			repeatPasswordInputField.setText("");
//			return;
//		}
//
//		if (emailList.contains(username) == true) {
//			DOptionPane.showError("Fehler", "Dieser Benutzername ist bereits vergeben!");
//			usernameInputField.setText("");
//			passwordInputField.setText("");
//			repeatPasswordInputField.setText("");
//			return;
//		}
//
//		if (username.length() < 8) {
//			DOptionPane.showError("Fehler", "Das Passwort ist zu kurz! Es muss mindestens 8 Zeichen lang sein!");
//			passwordInputField.setText("");
//			repeatPasswordInputField.setText("");
//			return;
//		}
//
//		if (!password.equals(repeatedPassword)) {
//			DOptionPane.showError("Fehler", "Die Passwörter stimmen nicht überein!");
//			passwordInputField.setText("");
//			repeatPasswordInputField.setText("");
//			return;
//		}
//		// <3
//		try {
//			password = HashPassword.hashPassword(password);
//		} catch (NoSuchAlgorithmException e) {
//			e.printStackTrace();
//		}
//		db.befehlAusfuehren("INSERT INTO user ([right], password, email, id) VALUES ('Yes', '" + password + "', '"
//				+ username + "'");
//
//		System.out.println("Successful!");
