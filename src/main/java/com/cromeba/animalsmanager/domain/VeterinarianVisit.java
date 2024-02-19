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
@Entity
public class VeterinarianVisit {

    @Id
    @Column(name = "id")
    private Long id;
    @Column(name = "date")
    private String date;
    @Column(name = "title")
    private String title;
    @Column(name = "description")
    private String description;
    @Column(name = "animal_id")
    private Animal animal;
    @Column(name = "weight")
    private Float weight;
    @Column(name = "veterinarian")
    private String veterinarian;
}
