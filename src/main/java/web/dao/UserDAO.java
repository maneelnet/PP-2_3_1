package web.dao;

import web.model.User;

import java.util.List;

public interface UserDAO {

    List<User> usersList();

    void saveUser(User user);

    void deleteUser(Long id);

    void updateUser(User user);

    User showUser(Long id);

}
