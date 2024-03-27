package com.example.atm_software;

import java.sql.*;

public class dbConnection {
    //Данные для подключения к базе данных
    static final String url = "jdbc:mysql://127.0.0.1:3305/atm_software?useSSL=false";
    static final String username = "root";
    static final String password = "12341324";

    public void singUpUser(User user) {
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
            prSt.setString(1, user.getLastname());
            prSt.setString(2, user.getFirstname());
            prSt.setString(3, user.getSurname());
            prSt.setString(4, user.getPhoneNumber());
            prSt.setString(5, user.getPinKod());

            prSt.executeUpdate();
            // Закрытие конекта к базе данных
//            connection.close();
        } catch (SQLException e) {
            System.out.println("Error connecting to database: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public ResultSet getUser(User user) {
        ResultSet resSet = null;
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            System.out.println("Connecting to database...");
            if (!connection.isClosed()) {
                System.out.println("Connected successfully!");
            } else {
                System.out.println("There is no connection!");
            }
            // Создание запроса
            String select = "SELECT * FROM " + Const.USER_TABLE + " WHERE " +
                    Const.USER_PHONENUMBER + "=? AND " + Const.USER_PINKOD + "=?";
            // Выполнение запроса
            var prSt = connection.prepareStatement(select);
            prSt.setString(1, user.getPhoneNumber());
            prSt.setString(2, user.getPinKod());

            resSet = prSt.executeQuery();
            // Закрытие конекта к базе данных
//            connection.close();
        } catch (SQLException e) {
            System.out.println("Error connecting to database: " + e.getMessage());
            e.printStackTrace();
        }
        return resSet;
    }

}

