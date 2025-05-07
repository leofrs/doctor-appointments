package com.devLeo.Appointments.features.users.patient.repository;

import com.devLeo.Appointments.features.users.patient.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PatientRepository extends JpaRepository<Patient, UUID> {
    Patient findByCardSUS(String cardSUS);
    Patient findByEmail(String email);
}
