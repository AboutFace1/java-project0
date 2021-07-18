package application;

import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class App {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        int[] ids = {0, 1, 2};
        String[] names = {"Sue", "Bob", "Charley"};

        Class.forName("com.mysql.cj.jdbc.Driver");

        String dbUrl = "jdbc:mysql://localhost:3306/people?serverTimezone=UTC";

        var conn = DriverManager.getConnection(dbUrl, "root", "Timur10062000");
        var stmt = conn.createStatement();
        conn.setAutoCommit(false);



        var sql = "insert into user (id, name) values (?, ?)";
        var insertStatement = conn.prepareStatement(sql);

        for (int i=0; i<ids.length; i++){

            insertStatement.setInt(1, ids[i]);
            insertStatement.setString(2, names[i]);

            //insertStatement.executeUpdate();
        }

        conn.commit();
        insertStatement.close();

        sql = "select id, name from user";
        var rs = stmt.executeQuery(sql);

        while(rs.next()){
            int id = rs.getInt("id");
            String name = rs.getString("name");

            System.out.println(id + ": " + name);
        }


        conn.close();
        stmt.close();

    }
}
