package com.cromeba.animalsmanager.application.ports.in;

import com.cromeba.animalsmanager.infrastructure.db.models.AnimalMO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/api")
public interface AnimalInterface {

    @GetMapping("/get-animals")
    List<AnimalMO> getAllAnimals();

    @GetMapping("/get-animal/{id}")
    ResponseEntity<AnimalMO> getAnimalById(Long id);

    @GetMapping("/get-species/{species}")
    List<AnimalMO> getAnimalsBySpecies(String species);

    @GetMapping("/get-animal-by-name/{name}")
    List<AnimalMO> getAnimalsByName(String name);
}
