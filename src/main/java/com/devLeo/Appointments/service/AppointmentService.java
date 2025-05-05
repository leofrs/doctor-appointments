package com.devLeo.Appointments.service;

import com.devLeo.Appointments.DTO.request.AppointmentRequest;
import com.devLeo.Appointments.repository.AppointmentRepository;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

@Service
public class AppointmentService {
    private final AppointmentRepository appointmentRepository;

    public AppointmentService(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }

    public void makeAppointment(@Valid AppointmentRequest appointmentRequest) {
        appointmentRepository.dbForAppointments.add(appointmentRequest);
    }

    public Object getAppointment() {
        return appointmentRepository.dbForAppointments;
    }
}
