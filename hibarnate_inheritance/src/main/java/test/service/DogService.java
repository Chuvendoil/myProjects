package test.service;

import test.domain.Dog;

import java.util.List;

/**
 * Created by Chuvychin on 25.04.2015.
 */
public interface DogService {

    boolean create(Dog dog);
    boolean update(Dog dog);
    boolean delete(Dog dog);
    List<Dog> findAll();
}
