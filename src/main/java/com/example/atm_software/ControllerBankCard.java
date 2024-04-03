package com.example.atm_software;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ControllerBankCard {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button CloseButton;

    @FXML
    private Button TakeOffButton;

    @FXML
    private TextField TextCardNumber;

    @FXML
    private TextField TextCards;

    @FXML
    void initialize() {

        CloseButton.setOnAction(ActionEvent -> {

        });

        TakeOffButton.setOnAction(ActionEvent -> {

        });

    }

}
