package com.cromeba.animalsmanager.infrastructure.controllers;

import com.cromeba.animalsmanager.domain.Animal;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface AnimalMapper {

    AnimalMapper INSTANCE = Mappers.getMapper(AnimalMapper.class);
    AnimalDto toDto(Animal animal);
    Animal toDomain(AnimalDto animalDto);

    @Mapping(target = "id", ignore = true)
    AnimalDto createAnimalDtoWithoutId(String name, String species);
}
