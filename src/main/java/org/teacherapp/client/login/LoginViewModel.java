package org.teacherapp.client.login;

import de.saxsys.mvvmfx.ViewModel;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class LoginViewModel implements ViewModel {

	private StringProperty usernameInput = new SimpleStringProperty();
	private StringProperty passwordInput = new SimpleStringProperty();

	public StringProperty usernameInputProperty() {
		return usernameInput;
	}

	public StringProperty passwordInputProperty() {
		return passwordInput;
	}
}
