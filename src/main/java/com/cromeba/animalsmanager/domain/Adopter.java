package com.cromeba.animalsmanager.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Adopter {

    private Integer id;
    private String name;
    private String email;
    private String surname1;
    private String surname2;
    private String phone1;
    private String phone2;
    private Date birthDate;
    private String idNumber;
}
