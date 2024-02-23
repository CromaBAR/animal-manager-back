package com.cromeba.animalsmanager.infrastructure.db.models;

import com.cromeba.animalsmanager.domain.Animal;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "veterinarian_visit")
public class VeterinarianVisitMO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "visit_date")
    private String visitDate;
    @Column(name = "title")
    private String title;
    @Column(name = "description")
    private String description;
    @ManyToOne(targetEntity = AnimalMO.class)
    @JoinColumn(name = "animal_id")
    private AnimalMO animal;
    @Column(name = "weight")
    private Float weight;
    @Column(name = "veterinarian")
    private String veterinarian;
}
