package com.example.atm_software;

import java.sql.*;

public class Main {

    public Connection Conn() throws SQLException {
        //подключение к база данных
        String url = "jdbc:mysql://127.0.0.1:3305/atm_software";
        String user = "root";
        String password = "12341324";
        Connection connection = DriverManager.getConnection(url, user, password);
        try {

            Statement statement = connection.createStatement();
            // небольшой запрос в бд
            statement.execute("INSERT INTO users(userID, firstname, lastname, surname,phoneNumber, pinKod) VALUES('4','Иванов','Иван','Иванович','89345395334','1724')"); //добавление пользователя в базу

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return connection;
    }

    //Добавление пользователя в базу при Регистрации
    public void signUpUser(String userID,String lastname, String firstname, String surname, String phoneNumber, String pinKod) {
        String insert = "INSERT INTO" + Const.USER_TABLE + "("+ Const.USER_ID+","+ Const.USER_LASTNAME + "," + Const.USER_FIRSTNAME + ","
                + Const.USER_SURNAME + "," + Const.USER_PHONENUMBER + "," + Const.USER_PINKOD + ")" + "VALUES(?,?,?,?,?)";

        try {
            PreparedStatement preparedStatement = Conn().prepareStatement(insert);
            preparedStatement.setString(1, userID);
            preparedStatement.setString(2, lastname);
            preparedStatement.setString(3, firstname);
            preparedStatement.setString(4, surname);
            preparedStatement.setString(5, phoneNumber);
            preparedStatement.setString(6, pinKod);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
