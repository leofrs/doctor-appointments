package com.devLeo.Appointments.controller;

import com.devLeo.Appointments.DTO.request.AppointmentRequest;
import com.devLeo.Appointments.service.AppointmentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/appointments")
public class AppointmentController {
    private final AppointmentService appointmentService;

    public AppointmentController(AppointmentService appointmentService) {
        this.appointmentService = appointmentService;
    }

    @PostMapping("make-appointment")
    public ResponseEntity makeAppointment(@Valid @RequestBody AppointmentRequest appointmentRequest) {
            try{
                appointmentService.makeAppointment(appointmentRequest);
                return ResponseEntity.ok("Consulta agendada com sucesso!");
            }catch(Exception e){
                return ResponseEntity.badRequest().body("Erro ao agendar consulta: " + e.getMessage());
            }
    }

    @GetMapping("get-appointment")
    public ResponseEntity getAppointment() {
        return ResponseEntity.ok(appointmentService.getAppointment());
    }
}
