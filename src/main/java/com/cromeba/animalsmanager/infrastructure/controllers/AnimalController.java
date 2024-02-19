package com.cromeba.animalsmanager.infrastructure.controllers;

import com.cromeba.animalsmanager.application.ports.in.RestAnimalController;
import com.cromeba.animalsmanager.application.ports.out.AnimalRepository;
import com.cromeba.animalsmanager.domain.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

@RestController
@RequestMapping("/animals")
public class AnimalController implements RestAnimalController {
    AnimalRepository repository;

    AnimalMapper animalMapper;

    public AnimalController(AnimalRepository repository, AnimalMapper animalMapper) {
        this.repository = repository;
        this.animalMapper = animalMapper;
    }

    @Override
    public List<AnimalDto> getAllAnimals() {
        List<AnimalDto> animalDtoList = new ArrayList<>();
        repository.findAll().forEach(animal -> {
                AnimalDto animalDto = animalMapper.INSTANCE.toDto(animal);
                animalDtoList.add(animalDto);
        });
        return animalDtoList;
    }

    @Override
    public AnimalDto getAnimalById(Long id) {
        return null;
    }

    @Override
    public List<AnimalDto> getAnimalsBySpecies(String species) {
        return null;
    }

    @Override
    public List<AnimalDto> getAnimalsByName(String name) {
        return null;
    }
}
