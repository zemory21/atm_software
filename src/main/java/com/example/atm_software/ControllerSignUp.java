package com.example.atm_software;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class ControllerSignUp {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField ControllerSignUpFisrstName;

    @FXML
    private TextField ControllerSignUpLastName;

    @FXML
    private TextField ControllerSignUpPhoneNumber;

    @FXML
    private PasswordField ControllerSignUpPinKod;

    @FXML
    private Button ControllerSignUpRegister;

    @FXML
    private TextField ControllerSignUpSureName;

    @FXML
    void initialize() {

        ControllerSignUpRegister.setOnAction(event -> {
            signUpNewUsers();
            ControllerSignUpRegister.getScene().getWindow().hide();
            Window signIn = new Window();
            signIn.openWindow("SignIn");
        });
    }
    private void signUpNewUsers() {
        dbConnection conn = new dbConnection();

        conn.singUpUser(ControllerSignUpLastName.getText(), ControllerSignUpFisrstName.getText(),
                ControllerSignUpSureName.getText(), ControllerSignUpPhoneNumber.getText(), ControllerSignUpPinKod.getText());

    }

}
