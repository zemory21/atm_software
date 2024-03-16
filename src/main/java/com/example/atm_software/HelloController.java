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

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button ControllerSingInEnter;

    @FXML
    private TextField ControllerSingInPhone;

    @FXML
    private PasswordField ControllerSingInPinCode;

    @FXML
    private Button ControllerSingInRegister;

    @FXML
    void initialize() {
        ControllerSingInEnter.setOnAction(actionEvent -> {
            String phoneNumber = ControllerSingInPhone.getText().trim();
            String signInPinKod = ControllerSingInPinCode.getText().trim();
            if (!phoneNumber.equals("") && signInPinKod.equals("")) {
                loginUser(phoneNumber, signInPinKod);
            } else {
                System.out.println("Одно или несколько полей пустые!");
            }
        });

        ControllerSingInRegister.setOnAction(actionEvent -> {
            //Открытие другого окна при нажатии на кнопку!
            ControllerSingInRegister.getScene().getWindow().hide();// скрытие окна после нажатия на кнопку Зарегистрироваться

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("SignUp.fxml")); // путь к окну которое будет окрываться после нажатия на кнопку

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

    private void loginUser(String phoneNumber, String signInPinKod) {
    }
}
