package dao;

import api.UserDao;
import entity.User;

import java.util.List;

public class UserDaoImpl implements UserDao {
    private String fileName;

    public UserDaoImpl(String fileName){
        super();
        this.fileName=fileName;
    }

    public void saveUser(User user) {

    }

    public void saveUsers(List<User> users) {

    }

    public List<User> getAllUsers() {
        return null;
    }

    public User getUserById(long id) {
        return null;
    }

    public User getUserByLogin(String login) {
        return null;
    }

    public void removeUserById(long id) {

    }

    public void removeUserByLogin(String login) {

    }
}
