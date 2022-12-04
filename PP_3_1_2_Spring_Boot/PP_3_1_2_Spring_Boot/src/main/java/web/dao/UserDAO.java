package web.dao;

import web.model.User;

import java.util.List;

public interface UserDAO {
    List<User> listUsers();

    User getUser(int id);

    void update(int id, User user);

    void delete(int id);

    void add(User user);
}
