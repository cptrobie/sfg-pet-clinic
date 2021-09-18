package com.acuity.sfgpetclinic.service;

import com.acuity.sfgpetclinic.model.Vet;

public interface VetService extends CrudService<Vet, Long> {

    Vet findByLasName(String lastName);
}
