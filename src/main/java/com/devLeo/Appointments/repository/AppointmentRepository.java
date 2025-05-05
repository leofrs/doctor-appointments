package com.devLeo.Appointments.repository;

import com.devLeo.Appointments.DTO.request.AppointmentRequest;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AppointmentRepository {
    public List<AppointmentRequest> dbForAppointments = new ArrayList<AppointmentRequest>();
}
