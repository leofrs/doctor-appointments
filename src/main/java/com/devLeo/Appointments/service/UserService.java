package com.devLeo.Appointments.service;

import com.devLeo.Appointments.DTO.request.UserRequest;
import com.devLeo.Appointments.repository.UserRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private PasswordEncoder passwordEncoder;

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void registerUser(@Valid UserRequest userRequest) {
        String encodedPassword = passwordEncoder.encode(userRequest.getPassword());
        userRequest.setPassword(encodedPassword);

        userRepository.dbForUsers.add(userRequest);
    }

    public Object getAllUsers() {
        return userRepository.dbForUsers;
    }
}
