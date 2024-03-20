package com.example.atm_software;

import java.sql.*;

public class dbConnection {
    public void singUpUser(String lastname, String firstname, String surname, String phoneNumber, String pinKod) {
        String url = "jdbc:mysql://127.0.0.1:3305/atm_software?useSSL=false";
        String username = "root";
        String password = "12341324";

        System.out.println("Connecting to database...");

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            if (!connection.isClosed()) {
                System.out.println("Connected successfully!");
            } else {
                System.out.println("There is no connection!");
            }
            String request = "INSERT INTO users(" + Const.USER_LASTNAME + "," +
                    Const.USER_FIRSTNAME + "," + Const.USER_SURNAME + "," + Const.USER_PHONENUMBER + "," +
                    Const.USER_PINKOD + ")" + "VALUES(?,?,?,?,?)";

            var prSt = connection.prepareStatement(request);
            prSt.setString(1, lastname);
            prSt.setString(2, firstname);
            prSt.setString(3, surname);
            prSt.setString(4, phoneNumber);
            prSt.setString(5, pinKod);

            prSt.executeUpdate();

            connection.isClosed();
        } catch (SQLException e) {
            System.out.println("Error connecting to database: " + e.getMessage());
            e.printStackTrace();
        }
    }

}

