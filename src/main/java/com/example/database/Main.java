package com.example.database;

import java.sql.*;

public class Main {

    public static void main(String[] args) {
        //подключение к база данных

        String url = "jdbc:mysql://127.0.0.1:3305/atm_software";
        String user = "root";
        String password = "12341324";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
