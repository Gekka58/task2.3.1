package web.servise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.DaoUser;
import web.model.User;

import java.util.List;

@SuppressWarnings("ALL")
@Service
public class MyServiceImp implements MyService {
    @Autowired
    DaoUser daoUser;

    @Override
    @Transactional
    public List<User> listUsers() {
        return daoUser.listUsers();
    }

    @Override
    @Transactional
    public User getUserById(int id) {
        return daoUser.getUserById(id);
    }

    @Override
    @Transactional
    public void updateUser(User user) {
        daoUser.updateUser(user);
    }

    @Override
    @Transactional
    public void addUser(User user) {
        daoUser.addUser(user);
    }

    @Override
    @Transactional
    public void removeById(int id) {
        daoUser.removeById(id);
    }

}
