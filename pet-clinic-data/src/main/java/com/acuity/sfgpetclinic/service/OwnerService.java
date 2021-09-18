package com.acuity.sfgpetclinic.service;

import com.acuity.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLasName(String lastName);
}
