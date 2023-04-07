package ru.kata.spring.boot_security.demo.servise;

import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserService {

    public List<User> getAllUsers();
    public void createNewUser(User user);
    public User getUser(Long id);
    public void updateUser(User user);
    public void deleteUser(Long id);
    public User findUserByUsername(String username);

    public User getAuthUser();
}
