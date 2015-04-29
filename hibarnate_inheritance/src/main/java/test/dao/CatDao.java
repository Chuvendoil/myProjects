package test.dao;

import test.domain.Cat;

import java.util.List;

/**
 * Created by Chuvychin on 19.04.2015.
 */
public interface CatDao {
    boolean create(Cat cat);
    boolean update (Cat cat);
    boolean delete (Cat cat);
    List<Cat> findAll();
}
