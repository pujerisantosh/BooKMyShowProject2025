package com.scaler.bookmyshowproject2025.services;

import com.scaler.bookmyshowproject2025.models.User;
import org.springframework.stereotype.Service;
import com.scaler.bookmyshowproject2025.repos.UserRepository;

import java.util.Optional;

@Service
public class UserServices {

    private static UserRepository userRepository;

    public UserServices(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public static User signUpUser(
            String username,
            String email,
            String password
    ) {
        // Check if user is already registered using email
        Optional<User> userOptional = userRepository.findByEmail(email);
        if (userOptional.isPresent()) {
            throw new RuntimeException("User already exists");
        }
        User user = new User();
        user.setEmail(email);
        user.setPassword(password);
        user.setName(username);
        return userRepository.save(user);
    }

}