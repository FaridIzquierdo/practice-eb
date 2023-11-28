package edu.upc.practiceeb.service;

import edu.upc.practiceeb.model.User;

import java.util.List;

public interface UserService {
    public abstract User createUser(User user);
    public abstract User updateUser(User user);
    public abstract User getUserById(int id);
    public abstract void deleteUser(int id);
    public abstract boolean isUserExist(int id);
    public abstract List<User> getAllUsers();

}
