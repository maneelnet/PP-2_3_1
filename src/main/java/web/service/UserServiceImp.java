package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.UserDAO;
import web.model.User;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Transactional
    @Override
    public List<User> usersList() {
        return userDAO.usersList();
    }

    @Transactional
    @Override
    public void saveUser(User user) {
        userDAO.saveUser(user);
    }

    @Transactional
    @Override
    public void deleteUser(Long id) {
        userDAO.deleteUser(id);
    }

    @Transactional
    @Override
    public void updateUser(User user) {
        userDAO.updateUser(user);
    }

    @Transactional
    @Override
    public User showUser(Long id) {
        return userDAO.showUser(id);
    }
}
