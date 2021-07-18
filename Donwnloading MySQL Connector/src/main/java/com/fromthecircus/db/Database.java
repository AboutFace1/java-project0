
package com.fromthecircus.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private static Database db = new Database();
    private final String URL = "jdbc:mysql://localhost:3306/people?serverTimezone=UTC";
    private Connection conn;

    public static Database getInstance() {
        return db;
    }

    private Database() {

    }

    public Connection getConnection(){
        return conn;
    }

    public void connect() throws SQLException {
        conn = DriverManager.getConnection(URL, "root", "Timur10062000");

    }

    public void disconnect() throws SQLException {
        conn.close();
    }
}
