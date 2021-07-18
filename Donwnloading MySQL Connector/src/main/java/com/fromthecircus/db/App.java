package com.fromthecircus.db;

import java.sql.SQLException;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws SQLException {
        System.out.println("Hello World");

        var db = Database.getInstance();
        db.connect();

        System.out.println("Connected");

        db.disconnect();
    }
}
