package com.isil.Sesion1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MainApp {

    public static void main(String[] args) throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/TEST",
                "root",
                "root"
        );

        Statement stmt= con.createStatement();

        int resultUpdate = stmt.executeUpdate("update Users set phone='8282282' where name='Messi'");

        ResultSet result = stmt.executeQuery("select * from Users where name='Messi'");


        while(result.next()){
            //System.out.println(result.getString((0));
            //System.out.println(result.getString((1));
            //System.out.println(result.getString((2))
            System.out.println(result.getString("idUser"));
            System.out.println(result.getString("name"));
            System.out.println(result.getString("phone"));
            System.out.println(result.getString("city"));
        }

    }

}

