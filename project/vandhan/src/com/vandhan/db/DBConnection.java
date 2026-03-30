package com.vandhan.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/vandhan",
                    "root",
                    "admin@123"
            );

            return con;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
