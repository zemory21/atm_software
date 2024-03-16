package com.example.atm_software;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

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
        /*
        DatabaseHandler dbHandler = new DatabaseHandler();
        ControllerSignUpRegister.setOnAction(actionEvent -> {
            dbHandler.signUpUser(ControllerSignUpFisrstName.getText(), ControllerSignUpLastName.getText(), ControllerSignUpSureName.getText(), ControllerSignUpPinKod.getText(),
                    ControllerSignUpPinKod.getText());
        });
        */

        ControllerSignUpRegister.setOnAction(actionEvent -> {
            ControllerSignUpRegister.getScene().getWindow().hide();

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("GlobalWindow.fxml"));

            try {
                loader.load();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();

        });

    }

}
