package org.teacherapp.client.login;

import org.teacherapp.core.frontend.ViewBase;

import de.saxsys.mvvmfx.InjectViewModel;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

/**
 * Login view, where you can set your username and password. A register function allows the user to input new account
 * data, when there aren't any recognized by MySQL connection.
 */
public class LoginView extends ViewBase<LoginViewModel> {

    @InjectViewModel
    private LoginViewModel viewModel = new LoginViewModel();

    private TextField usernameInputField = new TextField();
    private PasswordField passwordInputField = new PasswordField();

    private PasswordField repeatPasswordInputField = new PasswordField();

    private Button loginButton = new Button("Anmelden");
    private Button registerButton = new Button("Registieren");

    public LoginView() {
        this.initializeGUI();
    }

    /**
     * Initializes new login window with appropriate components.
     */
    @Override
    protected void initializeGUI() {
        super.initializeGUI();
        VBox centerContainer = new VBox();
        centerContainer.setPadding(new Insets(25, 25, 25, 25));
        centerContainer.setSpacing(25);

        viewModel.usernameInputProperty().bindBidirectional(usernameInputField.textProperty());
        viewModel.passwordInputProperty().bindBidirectional(passwordInputField.textProperty());

        centerContainer.getChildren().addAll(usernameInputField, passwordInputField, loginButton, registerButton);
        this.setCenter(centerContainer);
    }
}