package com.devLeo.Appointments.repository;

import com.devLeo.Appointments.DTO.request.AppointmentRequest;
import com.devLeo.Appointments.DTO.request.UserRequest;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    public List<UserRequest> dbForUsers = new ArrayList<UserRequest>();
}
