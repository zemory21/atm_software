package com.example.atm_software;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ControllerOtherSum {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button ControllerSingInRegister21213;

    @FXML
    private TextField TextOtherSum;

    @FXML
    private Button eight;

    @FXML
    private Button five;

    @FXML
    private Button four;

    @FXML
    private Button nine;

    @FXML
    private Button one;

    @FXML
    private Button seven;

    @FXML
    private Button six;

    @FXML
    private Button three;

    @FXML
    private Button two;

    @FXML
    private Button zero;

    @FXML
    void initialize() {

        one.setOnAction(ActionEvent -> {
            TextOtherSum.setText(TextOtherSum.getText()+"1");

        });
        two.setOnAction(ActionEvent -> {
            TextOtherSum.setText(TextOtherSum.getText()+"2");
        });
        three.setOnAction(ActionEvent -> {
            TextOtherSum.setText(TextOtherSum.getText()+"3");
        });
        four.setOnAction(ActionEvent -> {
            TextOtherSum.setText(TextOtherSum.getText()+"4");
        });
        five.setOnAction(ActionEvent -> {
            TextOtherSum.setText(TextOtherSum.getText()+"5");
        });
        six.setOnAction(ActionEvent -> {
            TextOtherSum.setText(TextOtherSum.getText()+"6");
        });
        seven.setOnAction(ActionEvent -> {
            TextOtherSum.setText(TextOtherSum.getText()+"7");
        });
        eight.setOnAction(ActionEvent -> {
            TextOtherSum.setText(TextOtherSum.getText()+"8");
        });
        nine.setOnAction(ActionEvent -> {
            TextOtherSum.setText(TextOtherSum.getText()+"9");
        });
        zero.setOnAction(ActionEvent -> {
            TextOtherSum.setText(TextOtherSum.getText()+"0");
        });


    }

}
