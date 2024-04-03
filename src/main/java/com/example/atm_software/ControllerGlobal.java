package com.example.atm_software;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class ControllerGlobal {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label ControllerSingInEnter;

    @FXML
    private Button ControllrGlobalHistory;

    @FXML
    private Button ControllrGlobalInsert;

    @FXML
    private Button ControllrGlobalSendAnotherBank;

    @FXML
    private Button ControllrGlobalTakeOff;

    @FXML
    private Button ControllrGlobalToPay;

    @FXML
    void initialize() {

        ControllrGlobalTakeOff.setOnAction(ActionEvent -> {
            ControllrGlobalTakeOff.getScene().getWindow().hide();
            Window takeOff = new Window();
            takeOff.openWindow("TakeOff.fxml");

        });

        ControllrGlobalToPay.setOnAction(ActionEvent -> {
            ControllrGlobalToPay.getScene().getWindow().hide();
            Window toPay = new Window();
            toPay.openWindow("ToPay.fxml");
        });

        ControllrGlobalInsert.setOnAction(ActionEvent -> {
            ControllrGlobalInsert.getScene().getWindow().hide();
            Window insert = new Window();
            insert.openWindow("Insert.fxml");
        });

        ControllrGlobalSendAnotherBank.setOnAction(ActionEvent -> {
            ControllrGlobalSendAnotherBank.getScene().getWindow().hide();
            Window otherBank = new Window();
            otherBank.openWindow("OtherBank.fxml");
        });

        ControllrGlobalHistory.setOnAction(ActionEvent -> {
            ControllrGlobalHistory.getScene().getWindow().hide();
            Window history = new Window();
            history.openWindow("History.fxml");
        });

    }



}
