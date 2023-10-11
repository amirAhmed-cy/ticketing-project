package com.cydeo.service;

import java.util.List;

public interface CrudService<T, ID> {

    T save(T object);
    List<T> findAll();
    T findByID(ID id);
    void deleteById(ID id);

}
