module com.example.atm_software {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.atm_software to javafx.fxml;
    exports com.example.atm_software;
}