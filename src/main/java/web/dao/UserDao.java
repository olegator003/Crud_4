package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {

    List<User> getAllUser();
    User getUserById(long id);
    void addUser(User user);
    void updateUser(long id, User modifiedUser);
    void removeUser(long id);
}
