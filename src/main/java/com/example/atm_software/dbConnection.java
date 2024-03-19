package com.example.atm_software;

import java.sql.*;

public class dbConnection {
    static final String url = "jdbc:mysql://127.0.0.1:3305/atm_software";
    static final String user = "root";
    static final String password = "12341324";

    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            if (!conn.isClosed()) {
                System.out.println("Норм");
            } else {
                System.out.println("плохо");
            }
            String request = "INSERT INTO" + Const.USER_TABLE + "(lastname, firstname, surname," +
                    " phoneNumber, pinKod)" + "VALUES(?,?,?,?,?)";
            var stm = conn.prepareStatement(request);
            stm.setString(1, Const.USER_LASTNAME);
            stm.setString(2, Const.USER_FIRSTNAME);
            stm.setString(3, Const.USER_SURNAME);
            stm.setString(4, Const.USER_PHONENUMBER);
            stm.setString(5, Const.USER_PINKOD);
            stm.executeUpdate();
            conn.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void signUpUser(String lastname, String firstname, String surname, String phoneNumber, String pinKod) {
        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            if (!conn.isClosed()) {
                System.out.println("Норм");
            } else {
                System.out.println("плохо");
            }
            String request = "INSERT INTO" + Const.USER_TABLE + "(lastname, firstname, surname," +
                    " phoneNumber, pinKod)" + "VALUES(?,?,?,?,?)";
            var stm = conn.prepareStatement(request);
            stm.setString(1, lastname);
            stm.setString(2, firstname);
            stm.setString(3, surname);
            stm.setString(4, phoneNumber);
            stm.setString(5, pinKod);
            stm.executeUpdate();
            conn.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

