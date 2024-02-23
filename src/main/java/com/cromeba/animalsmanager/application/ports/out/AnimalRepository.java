package com.cromeba.animalsmanager.application.ports.out;

import com.cromeba.animalsmanager.domain.Animal;
import com.cromeba.animalsmanager.infrastructure.db.models.AnimalMO;
import org.springframework.data.repository.CrudRepository;

public interface AnimalRepository extends CrudRepository<Animal, Long>{
}
