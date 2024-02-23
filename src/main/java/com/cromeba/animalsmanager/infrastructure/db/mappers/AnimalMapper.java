package com.cromeba.animalsmanager.infrastructure.db.mappers;

import com.cromeba.animalsmanager.domain.Animal;
import com.cromeba.animalsmanager.infrastructure.db.models.AnimalMO;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
public interface AnimalMapper {
    AnimalMO toMO(Animal animal);
    Animal toDomain(AnimalMO animalMO);
}
