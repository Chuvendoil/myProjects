package test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.domain.Dog;
import test.dao.DogDao;

import java.util.List;

/**
 * Created by Chuvychin on 25.04.2015.
 */
@Service
public class DogServicempl implements DogService {

    @Autowired
    private DogDao dogDao;

    public DogServicempl() {
    }

    @Override
    public boolean create(Dog dog) {
        dogDao.create(dog);
        return true;
    }

    @Override
    public boolean update(Dog dog) {
        return false;
    }

    @Override
    public boolean delete(Dog dog) {
        return false;
    }

    @Override
    public List<Dog> findAll() {
        return dogDao.findAll();
    }
}
