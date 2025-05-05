package com.devLeo.Appointments.DTO.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
public class AppointmentRequest {
    @NotBlank(message = "Nome do paciente não pode ser vazio")
    private String userName;

    @NotNull(message = "Data da consulta não pode ser vazia")
    @JsonFormat(pattern = "dd/MM/yyyy HH:mm")
    private LocalDateTime appointmentDate;

    @NotBlank(message = "Motivo da consulta não pode ser vazio")
    private String appointmentMotivation;
}
