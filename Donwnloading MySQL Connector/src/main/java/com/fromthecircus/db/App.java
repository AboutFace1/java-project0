
package com.fromthecircus.db;

import java.sql.SQLException;
import java.util.Properties;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws SQLException {

        var props = Profile.getProperties("db");

        System.out.println("Hello World");

        var db = Database.getInstance();
        db.connect(props);

        System.out.println("Connected");
        UserDao userDao = new UserDaoImpl();

        //userDao.save(new User("Jackson"));
        userDao.delete(new User(18));
        var users = userDao.getAll();

        users.forEach(System.out::println);

        var userOpt = userDao.findById(4);

        if (userOpt.isPresent()) {
            User user = userOpt.get();
            System.out.println("Retrieved: " + user);
            user.setName("Snoopy");
            userDao.update(user);
        }
        else System.out.println("No user retrieved");

        db.disconnect();
    }
}
