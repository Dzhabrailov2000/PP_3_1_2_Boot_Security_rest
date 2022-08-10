package ru.kata.spring.boot_security.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.kata.spring.boot_security.demo.models.User;
import ru.kata.spring.boot_security.demo.repositories.UserRepository;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userDao;

    @Autowired
    public UserServiceImpl(UserRepository userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.findAll();
    }

    @Override
    public User getUserById(long id) {
        return userDao.findById(id).get();
    }

    @Transactional
    @Override
    public void removeUserById(long id) {
        userDao.deleteById(id);
    }

    @Transactional
    @Override
    public void updateUserById(long id, User user) {
        userDao.save(user);
    }

    @Transactional
    @Override
    public void saveUser(User user) {
        userDao.save(user);
    }
}