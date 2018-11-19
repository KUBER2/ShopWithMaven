package api;

import entity.User;

import java.util.List;

public interface UserDao {
    void saveUser(User user);
    void saveUsers(List<User> users);
    List<User> getAllUsers();
    User getUserById(long id);
    User getUserByLogin(String login);
    void removeUserById(long id);
    void removeUserByLogin(String login);
}
