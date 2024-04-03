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

public class ControllerSignIn {

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
            if (!phoneNumber.equals("") || signInPinKod.equals("")) {
                loginUser(phoneNumber, signInPinKod);
            } else {
                System.out.println("Одно или несколько полей пустые!");
            }
        });

        ControllerSingInRegister.setOnAction(actionEvent -> {
            //Открытие другого окна при нажатии на кнопку!
            ControllerSingInRegister.getScene().getWindow().hide();// скрытие окна после нажатия на кнопку Зарегистрироваться

            Window signUpWindow = new Window();
            signUpWindow.openWindow("SignUp");
        });
    }

    private void loginUser(String phoneNumber, String signInPinKod) {
        dbConnection conn = new dbConnection();

        User user = conn.getUser(phoneNumber, signInPinKod);
        if (user != null) {
            System.out.println("Пользователь авторизован!");
            Window global = new Window();
            ControllerSingInEnter.getScene().getWindow().hide();
            global.openWindow("GlobalWindow");
        } else {
            System.out.println("Пользователь не найден!");
        }
    }
}
