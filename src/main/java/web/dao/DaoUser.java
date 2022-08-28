package web.dao;

import web.model.User;

import java.util.List;

public interface DaoUser {

    List<User> listUsers();


    void addUser(User user);

    User getUserById(int id);

    void updateUser(User user);

    void removeById(int id);
}
