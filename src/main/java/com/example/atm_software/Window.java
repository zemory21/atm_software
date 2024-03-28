package com.example.atm_software;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Window {
    void openWindow(String nameWindow){
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(nameWindow)); // путь к окну которое будет окрываться после нажатия на кнопку

        try {
            loader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Parent root = loader.getRoot();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.showAndWait();
    }
}
