package com.cromeba.animalsmanager.application.ports.out;

import com.cromeba.animalsmanager.domain.Animal;
import org.springframework.data.repository.CrudRepository;

public interface AnimalRepository extends CrudRepository<Animal, Long>{
}
