package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.models.Role;
import ru.kata.spring.boot_security.demo.models.User;
import java.util.List;
import java.util.Set;

public interface UserService {
    List<User> getAllUsers();

    User getUserById(long id);
    User getUserByUsername(String username);

    void removeUserById(long id);

    void updateUserById(long id, User user);

    void saveUser(User user);

    List<Role> getAllRoles();

    Set<Role> findRolesById (Integer[] RoleIds);
}