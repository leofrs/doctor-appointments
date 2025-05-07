package com.devLeo.Appointments.features.users.patient.controller;

import com.devLeo.Appointments.features.users.patient.entity.Patient;
import com.devLeo.Appointments.features.users.patient.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {
    @Autowired
    LoginService loginService;

    @RequestMapping("/patient")
    public ResponseEntity<String> login(@RequestBody Patient userInfos) {
        try {
            loginService.login(userInfos);
            return ResponseEntity.status(201).body("Login realizado com sucesso!");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
