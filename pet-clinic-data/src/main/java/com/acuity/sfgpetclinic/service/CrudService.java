package com.acuity.sfgpetclinic.service;

import java.util.Set;

public interface CrudService<T, Id> {

    T findById(Id id);

    Set<T> findAll();

    T save(T object);

    void delete(T object);

    void deleteById(Id id);
}
