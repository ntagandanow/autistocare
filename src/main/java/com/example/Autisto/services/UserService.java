package com.example.Autisto.services;




import com.example.Autisto.model.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    List<User> findAllUsers();
    User findById(Long id);
}
