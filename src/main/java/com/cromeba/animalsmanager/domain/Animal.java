package com.cromeba.animalsmanager.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.Objects;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Animal {

    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "species_id")
    private Species species_id;
    @Column(name = "race_id")
    private Race race_id;
    @Column(name = "genre")
    private Genre genre;
    @Column(name = "description")
    private String description;
    @Column(name = "is_adopted")
    private Boolean isAdopted;
    @Column(name = "adopter_id")
    private Adopter adopterId;
    @Column(name = "is_sterilized")
    private Boolean isSterilized;
}
