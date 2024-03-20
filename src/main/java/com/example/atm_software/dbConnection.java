package com.example.atm_software;

import java.sql.*;

public class dbConnection {
    //Данные для подключения к базе данных
    static final String url = "jdbc:mysql://127.0.0.1:3305/atm_software?useSSL=false";
    static final String username = "root";
    static final String password = "12341324";

    public void singUpUser(String lastname, String firstname, String surname, String phoneNumber, String pinKod) {
        //Подключение к базе данных
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            System.out.println("Connecting to database...");
            if (!connection.isClosed()) {
                System.out.println("Connected successfully!");
            } else {
                System.out.println("There is no connection!");
            }
            // Создание запроса
            String request = "INSERT INTO users(" + Const.USER_LASTNAME + "," +
                    Const.USER_FIRSTNAME + "," + Const.USER_SURNAME + "," + Const.USER_PHONENUMBER + "," +
                    Const.USER_PINKOD + ")" + "VALUES(?,?,?,?,?)";
            // Выполнение запроса
            var prSt = connection.prepareStatement(request);
            prSt.setString(1, lastname);
            prSt.setString(2, firstname);
            prSt.setString(3, surname);
            prSt.setString(4, phoneNumber);
            prSt.setString(5, pinKod);

            prSt.executeUpdate();
            // Закрытие конекта к базе данных
            connection.isClosed();
        } catch (SQLException e) {
            System.out.println("Error connecting to database: " + e.getMessage());
            e.printStackTrace();
        }
    }

}

