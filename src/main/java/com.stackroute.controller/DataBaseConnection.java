package com.stackroute.controller;

import java.sql.*;

public class DataBaseConnection {
    private Connection con;

    public void insertData(String username,String password ) {
        try {
            //Resister Driver with driver manager service
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded");//create connection
            //here db1 is database name, root is username and root123 is password
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/login", "shalini", "shalini");
            //create statement object
            System.out.println("got connected");
            Statement stmt=con.createStatement();
            String query = " insert into loginandpassword (username,password)" + " values (?,?)";

            // create the mysql insert preparedstatement
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setString (1, username);
            preparedStmt.setString (2, password);
            // execute the preparedstatement
            preparedStmt.execute();


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
