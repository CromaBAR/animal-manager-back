package com.cromeba.animalsmanager.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Adopter {

    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "email")
    private String email;
    @Column(name = "surname_1")
    private String surname1;
    @Column(name = "surname_2")
    private String surname2;
    @Column(name = "phone_1")
    private String phone1;
    @Column(name = "phone_2")
    private String phone2;
    @Column(name = "birth_date")
    private Date birthDate;
    @Column(name = "id_number")
    private String idNumber;
}
