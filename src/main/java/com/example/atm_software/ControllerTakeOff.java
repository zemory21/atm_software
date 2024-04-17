package com.example.atm_software;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class ControllerTakeOff {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label ControllerSingInEnter;

    @FXML
    private Button Other;

    @FXML
    private Button exitButton;

    @FXML
    private Button fiveTausend;

    @FXML
    private Button fivihundert;

    @FXML
    private Button oneTausend;

    @FXML
    private Button twoTausend;

    @FXML
    void initialize() {
        Other.setOnAction(event -> {
            Other.getScene().getWindow().hide();
            Window window = new Window();
            window.openWindow("otherSum");
        });

    }

}
