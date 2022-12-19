package web.dao;

import org.springframework.stereotype.Repository;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDAOImp implements UserDAO {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<User> usersList() {
        return entityManager.createQuery("SELECT u FROM User u").getResultList();
    }

    @Override
    public void saveUser(User user) {
        entityManager.persist(user);
    }

    @Override
    public void deleteUser(Long id) {
        entityManager.remove(showUser(id));
    }

    @Override
    public void updateUser(User user) {
        entityManager.merge(user);
    }

    @Override
    public User showUser(Long id) {
        return entityManager.find(User.class, id);

    }
}
