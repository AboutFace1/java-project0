
package com.fromthecircus.db;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class UserDaoImpl implements UserDao{
    @Override
    public void save(User u) {
        var conn = Database.getInstance().getConnection();

        try {
            //Preparing statement
            var stmt = conn.prepareStatement("insert into user (name) values (?)");

            stmt.setString(1, u.getName());
            stmt.executeUpdate();

            stmt.close();
        } catch (SQLException e) {
            throw new DaoException(e);
        }
    }

    @Override
    public Optional<User> findById(int id) {
        return Optional.empty();
    }

    @Override
    public void update(User user) {

    }

    @Override
    public void delete(User user) {

    }

    @Override
    public List<User> getAll() {
        return null;
    }
}
