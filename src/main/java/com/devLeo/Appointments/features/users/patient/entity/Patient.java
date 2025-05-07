package com.devLeo.Appointments.features.users.patient.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table(name = "patients")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name= "user_name", nullable = false)
    private String userName;

    @Column(nullable = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(name = "cartao_sus", nullable = false)
    private String cardSUS;

    @Embedded
    private Address address;
}
