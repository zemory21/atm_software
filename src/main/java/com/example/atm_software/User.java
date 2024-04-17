package com.example.atm_software;

public class User {
    private String lastname;
    private String firstname;
    private String surname;
    private String phoneNumber;
    private String pinKod;
    private String user;
    private int Balance;

    public User(String phoneNumber, String pinKod) {
        this.phoneNumber = phoneNumber;
        this.pinKod = pinKod;
    }
    public User(String lastname, String firstname, String surname, String phoneNumber, String pinKod) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.pinKod = pinKod;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPinKod() {
        return pinKod;
    }

    public void setPinKod(String pinKod) {
        this.pinKod = pinKod;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getBalance() {
        return Balance;
    }

    public void setBalance(int balance) {
        Balance = balance;
    }
}
