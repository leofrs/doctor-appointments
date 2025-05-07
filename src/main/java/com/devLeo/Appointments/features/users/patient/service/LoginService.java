package com.devLeo.Appointments.features.users.patient.service;

import com.devLeo.Appointments.features.users.patient.entity.Patient;
import com.devLeo.Appointments.features.users.patient.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    @Autowired
    PatientRepository patientRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    public boolean login(Patient userInfos) {
        var patient = patientRepository.findByCardSUS(userInfos.getCardSUS());
        if (patient == null) {
            throw new RuntimeException("Paciente não encontrado.");
        }
        return passwordEncoder.matches(userInfos.getPassword(), patient.getPassword());
    }
}
