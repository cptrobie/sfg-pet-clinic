package com.acuity.sfgpetclinic.service;

import com.acuity.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet findByLasName(String lastName);

    Set<Vet> findAll();

    Vet save(Vet vet);
}
