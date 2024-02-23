package com.cromeba.animalsmanager.infrastructure.db.repository;

import com.cromeba.animalsmanager.application.ports.in.AnimalInterface;
import com.cromeba.animalsmanager.application.ports.out.AnimalRepository;
import com.cromeba.animalsmanager.domain.Animal;
import com.cromeba.animalsmanager.infrastructure.db.mappers.AnimalMapper;
import com.cromeba.animalsmanager.infrastructure.db.models.AnimalMO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.EntityResponse;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/animals")
public class AnimalInterfaceImpl implements AnimalInterface {
    AnimalRepository repository;
    AnimalMapper animalMapper;

    @Autowired
    public AnimalInterfaceImpl(AnimalRepository repository, AnimalMapper animalMapper) {
        this.repository = repository;
        this.animalMapper = animalMapper;
    }

    @Override
    public List<AnimalMO> getAllAnimals() {
        /*List<AnimalMO> animalMOList = new ArrayList<>();
        repository.findAll().forEach(animalMOList::add);
        return animalMOList;*/
        return null;
    }

    @Override
    public ResponseEntity<AnimalMO> getAnimalById(@PathVariable("id") Long id) {
        return new ResponseEntity<>(
                animalMapper.toMO(repository.findById(id).get()),
                HttpStatus.OK
        );
    }

    @Override
    public List<AnimalMO> getAnimalsBySpecies(String species) {
        return null;
    }

    @Override
    public List<AnimalMO> getAnimalsByName(String name) {
        return null;
    }
}
