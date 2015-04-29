package test.dao;

import test.domain.Dog;

import java.util.List;

/**
 * Created by Chuvychin on 19.04.2015.
 */
public interface DogDao {
    boolean create(Dog dog);
    boolean update(Dog dog);
    boolean delete(Dog dog);
    List<Dog> findAll();
}
