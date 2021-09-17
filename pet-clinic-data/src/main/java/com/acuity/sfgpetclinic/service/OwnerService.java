package com.acuity.sfgpetclinic.service;

import com.acuity.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findById(Long id);

    Owner findByLasName(String lastName);

    Set<Owner> findAll();

    Owner save(Owner owner);
}
