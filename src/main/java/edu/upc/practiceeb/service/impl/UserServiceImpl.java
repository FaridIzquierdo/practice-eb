package edu.upc.practiceeb.service.impl;

import edu.upc.practiceeb.model.User;
import edu.upc.practiceeb.repository.UserRepository;
import edu.upc.practiceeb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }
    @Override
    public User updateUser(User user) {
        return userRepository.save(user);
    }
    @Override
    public User getUserById(int id) {
        return userRepository.findById(id).get();
    }
    @Override
    public void deleteUser(int id) {
        userRepository.deleteById(id);
    }
    @Override
    public boolean isUserExist(int id) {
        return userRepository.existsById(id);
    }
    @Override
    public List<User> getAllUsers() {
        return (List<User>) userRepository.findAll();
    }

}
