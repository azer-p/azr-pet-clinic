package com.springframework.azerpetclinic.services;

import com.springframework.azerpetclinic.model.Owner;
import com.springframework.azerpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

     Pet findById(Long id);
     Pet save(Pet pet);
     Set<Pet> findAll();
}
