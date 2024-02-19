package com.cromeba.animalsmanager.application.ports.in;

import com.cromeba.animalsmanager.domain.Animal;
import com.cromeba.animalsmanager.infrastructure.controllers.AnimalDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/api")
public interface RestAnimalController {

    @GetMapping("/get-animals")
    List<AnimalDto> getAllAnimals();

    @GetMapping("/get-animals/{id}")
    AnimalDto getAnimalById(Long id);

    @GetMapping("/get-animals/{species}")
    List<AnimalDto> getAnimalsBySpecies(String species);

    @GetMapping("/get-animals/{name}")
    List<AnimalDto> getAnimalsByName(String name);
}
