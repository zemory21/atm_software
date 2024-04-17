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
    private Label balance;

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
        //снять
        ControllrGlobalTakeOff.setOnAction(ActionEvent -> {
            ControllrGlobalTakeOff.getScene().getWindow().hide();
            Window takeOff = new Window();
            takeOff.openWindow("TakeOff");

        });
        //оплатить
        ControllrGlobalToPay.setOnAction(ActionEvent -> {
            ControllrGlobalToPay.getScene().getWindow().hide();
            Window toPay = new Window();
            toPay.openWindow("ToPay");
        });
        //внести
        ControllrGlobalInsert.setOnAction(ActionEvent -> {
            ControllrGlobalInsert.getScene().getWindow().hide();
            Window insert = new Window();
            insert.openWindow("Insert");
        });
        //другой банк
        ControllrGlobalSendAnotherBank.setOnAction(ActionEvent -> {
            ControllrGlobalSendAnotherBank.getScene().getWindow().hide();
            Window otherBank = new Window();
            otherBank.openWindow("OtherBank");
        });
        //история
        ControllrGlobalHistory.setOnAction(ActionEvent -> {
            ControllrGlobalHistory.getScene().getWindow().hide();
            Window history = new Window();
            history.openWindow("History");
        });

    }

    public void getScore(){
        dbConnection dbConnection = new dbConnection();
        int bal = dbConnection.getBalance();
    }

}
