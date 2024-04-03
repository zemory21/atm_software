package com.example.atm_software;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class ControllerHistory {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button CloseButton;

    @FXML
    private Label LabelHistory;

    @FXML
    void initialize() {

        CloseButton.setOnAction(ActionEvent -> {
            CloseButton.getScene().getWindow().hide();
            Window exit = new Window();
            exit.openWindow("GlobalWindow");
        });

    }

}
