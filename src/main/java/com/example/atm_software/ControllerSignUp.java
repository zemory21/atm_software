package com.example.atm_software;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

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
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("SignIn.fxml"));
            try {
                loader.load();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
        });
    }

    private void signUpNewUsers() {
        dbConnection conn = new dbConnection();

        conn.singUpUser(ControllerSignUpLastName.getText(), ControllerSignUpFisrstName.getText(),
                ControllerSignUpSureName.getText(), ControllerSignUpPhoneNumber.getText(), ControllerSignUpPinKod.getText());

    }


}
