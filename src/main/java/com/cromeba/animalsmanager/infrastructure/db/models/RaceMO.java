package com.cromeba.animalsmanager.infrastructure.db.models;

import com.cromeba.animalsmanager.domain.Species;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "race")
public class RaceMO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "denomination")
    private String denomination;
    @ManyToOne(targetEntity = SpeciesMO.class)
    @JoinColumn(name = "species_id")
    private SpeciesMO species;
}
