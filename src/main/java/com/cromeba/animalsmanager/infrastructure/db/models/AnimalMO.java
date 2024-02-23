package com.cromeba.animalsmanager.infrastructure.db.models;

import com.cromeba.animalsmanager.domain.Adopter;
import com.cromeba.animalsmanager.domain.Genre;
import com.cromeba.animalsmanager.domain.Race;
import com.cromeba.animalsmanager.domain.Species;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "animal")
public class AnimalMO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @ManyToOne(targetEntity = SpeciesMO.class)
    @JoinColumn(name = "species_id")
    private SpeciesMO species_id;
    @ManyToOne(targetEntity = RaceMO.class)
    @JoinColumn(name = "race_id")
    private RaceMO race_id;
    @Column(name = "genre")
    @Enumerated(EnumType.STRING)
    private GenreMO genre;
    @Column(name = "description")
    private String description;
    @Column(name = "is_adopted")
    private Boolean isAdopted;
    @ManyToOne(targetEntity = AdopterMO.class)
    @JoinColumn(name = "adopter_id")
    private AdopterMO adopterId;
    @Column(name = "is_sterilized")
    private Boolean isSterilized;
}
