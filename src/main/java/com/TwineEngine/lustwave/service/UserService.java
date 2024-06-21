package com.TwineEngine.lustwave.service;

import com.TwineEngine.lustwave.model.User;
import com.TwineEngine.lustwave.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    // Other user-related methods
}
