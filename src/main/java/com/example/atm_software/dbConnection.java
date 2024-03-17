package com.example.atm_software;

import java.sql.*;

public class dbConnection {
    static final String url = "jdbc:mysql://127.0.0.1:3305/atm_software";
    static final String user = "root";
    static final String password = "12341324";

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            var stm = conn.createStatement();
            stm.executeUpdate("insert into users (lastname, firstname, surname, phoneNumber, pinKod)"+"values('Григорьев', 'Игорь', 'Витальевич', '89016995224', '0234')");
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

