package test.service;

import test.domain.Cat;

import java.util.List;

/**
 * Created by Chuvychin on 25.04.2015.
 */
public interface CatService {
    boolean create(Cat cat);
    boolean update(Cat cat);
    boolean delete(Cat cat);
    List<Cat> findAll();
}
