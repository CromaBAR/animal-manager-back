package com.cromeba.animalsmanager.infrastructure.controllers;

import com.cromeba.animalsmanager.domain.Animal;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AnimalDto {

    private Long id;
    private String name;
    private String species;
}
