package com.devLeo.Appointments.features.users.patient.controller;

import com.devLeo.Appointments.features.users.patient.entity.Patient;
import com.devLeo.Appointments.features.users.patient.service.RegisterService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/register")
public class RegisterController {
    @Autowired
    RegisterService registerService;

    @RequestMapping("/patient")
    public ResponseEntity<String> register(@RequestBody Patient userInfos) {
        try{
            registerService.register(userInfos);
            return ResponseEntity.status(201).body("Paciente cadastrado com sucesso!");
        } catch (Exception e) {
           return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
