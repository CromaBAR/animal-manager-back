package com.cromeba.animalsmanager.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VeterinarianVisit {

    private Long id;
    private String date;
    private String title;
    private String description;
    private Animal animal;
    private Float weight;
    private String veterinarian;
}
