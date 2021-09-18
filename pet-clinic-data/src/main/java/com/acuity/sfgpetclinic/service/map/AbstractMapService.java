package com.acuity.sfgpetclinic.service.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractMapService<T, Id> {

    protected Map<Id, T> map = new HashMap<>();

    T findById(Id id) {
        return map.get(id);
    }

    Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    T save(Id id, T object) {
        map.put(id, object);
        return object;
    }

    void deleteById(Id id) {
        map.remove(id);
    }

    void delete(T object) {
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }
}
