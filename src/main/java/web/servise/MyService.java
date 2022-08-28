package web.servise;

import web.model.User;

import java.util.List;

public interface MyService {

    List<User> listUsers();

    User getUserById(int id);

    void updateUser(User user);

    void addUser(User user);

    void removeById(int id);
}
