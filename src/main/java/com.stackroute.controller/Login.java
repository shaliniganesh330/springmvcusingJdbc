package com.stackroute.controller;

public class Login {
    DataBaseConnection databaseconnection = new DataBaseConnection();
    public Login(String username, String password) {
        this.username = username;
        this.password = password;
        databaseconnection.insertData(this.username,this.password);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String username;
    private String password;

}
