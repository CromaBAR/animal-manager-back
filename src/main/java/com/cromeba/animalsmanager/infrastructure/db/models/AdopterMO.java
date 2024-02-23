package com.cromeba.animalsmanager.infrastructure.db.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "adopter")
public class AdopterMO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
