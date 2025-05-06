package com.devLeo.Appointments.controller;

import com.devLeo.Appointments.DTO.request.UserRequest;
import com.devLeo.Appointments.service.UserService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("register-user")
    public ResponseEntity createUser(@Valid @RequestBody UserRequest userRequest) {
        try{
            userService.registerUser(userRequest);
            return ResponseEntity.ok("Usuário registrado com sucesso!");
        }catch(Exception e){
            return ResponseEntity.badRequest().body("Erro ao registrar usuário: " + e.getMessage());
        }
    }

    @GetMapping("get-all-users")
    public ResponseEntity getUsers() {
        return ResponseEntity.ok(userService.getAllUsers());
    }
}
