package com.cromeba.animalsmanager.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.Objects;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Animal {

    private Integer id;
    private String name;
    private Species species_id;
    private Race race_id;
    private Genre genre;
    private String description;
    private Boolean isAdopted;
    private Adopter adopterId;
    private Boolean isSterilized;
}
