package com.devLeo.Appointments.features.users.patient.service;

import com.devLeo.Appointments.features.users.patient.entity.Patient;
import com.devLeo.Appointments.features.users.patient.repository.PatientRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class RegisterService {
    @Autowired
    PatientRepository patientRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public void register(Patient userInfos) {
        if(patientRepository.findByCardSUS(userInfos.getCardSUS()) != null) {
            throw new RuntimeException("O cartão SUS informado já está em uso.");
        }

        if(patientRepository.findByEmail(userInfos.getEmail()) != null) {
            throw new RuntimeException("O email informado já está em uso.");
        }

        var hashPassword = passwordEncoder.encode(userInfos.getPassword());
        userInfos.setPassword(hashPassword);

        patientRepository.save(userInfos);
    }
}
