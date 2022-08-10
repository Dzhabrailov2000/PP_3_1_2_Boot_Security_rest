package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.models.User;
import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User getUserById(long id);

    void removeUserById(long id);

    void updateUserById(long id, User user);

    void saveUser(User user);
}