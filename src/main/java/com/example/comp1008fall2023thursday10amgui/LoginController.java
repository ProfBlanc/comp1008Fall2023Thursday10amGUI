package com.example.comp1008fall2023thursday10amgui;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private TextField username;

    @FXML
    private PasswordField password;

    @FXML
    void onLoginClick(Event event) {

        System.out.println(username.getText());
        System.out.println(password.getText());

    }
    @FXML
    void onRegisterClick(Event event) {
        username.setText("");
        password.setText("");
    }

}
