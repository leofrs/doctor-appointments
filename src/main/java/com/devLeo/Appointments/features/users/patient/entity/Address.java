package com.devLeo.Appointments.features.users.patient.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Address {
    @Column(nullable = true)
    private String street;
    @Column(nullable = true)
    private String number;
    @Column(nullable = true)
    private String city;
    @Column(nullable = true)
    private String state;
    @Column(nullable = true)
    private String zipCode;
}
