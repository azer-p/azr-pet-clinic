package com.springframework.azerpetclinic.services;

import com.springframework.azerpetclinic.model.Vet;

import java.util.Set;

public interface VetService {
     Vet findById(Long id);
     Vet save(Vet vet);
     Set<Vet> findAll();
}
