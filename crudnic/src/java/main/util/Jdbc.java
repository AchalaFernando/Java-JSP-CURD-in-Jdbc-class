/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.util;

import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author Avian Tech Zone
 */
public class Jdbc {

    private static Connection Connection = null;

    public static Connection getConnection() {
        String DatabaseUrl = "jdbc:mysql://localhost/user";
        String DatabaseUsername = "root";
        String DatabasePassword = "";
        String DriverName = "com.mysql.jdbc.Driver";
        try {
            Class.forName(DriverName);
            Connection = DriverManager.getConnection(DatabaseUrl, DatabaseUsername, DatabasePassword);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Connection;
    }

}
