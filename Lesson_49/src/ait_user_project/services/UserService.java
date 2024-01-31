package ait_user_project.services;

import ait_user_project.model.User;

import java.util.List;

public interface UserService {

    void  createUser(String name, String email);
    User getByID(long id);
    User getByEmail(String email);

    List<User>getAllUsers();

    void updateUser(User user);
    void deleteById(long id);
}
