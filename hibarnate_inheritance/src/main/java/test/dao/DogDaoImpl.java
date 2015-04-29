package test.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import test.domain.Dog;

import java.util.List;

/**
 * Created by Chuvychin on 19.04.2015.
 */
@Transactional
@Repository
public class DogDaoImpl implements DogDao {

    @Autowired
    private SessionFactory factory;

    public DogDaoImpl() {
    }

    @Override
    public boolean create(Dog dog) {
        Session session = factory.getCurrentSession();
        session.save(dog);
        return true;
    }

    @Override
    public boolean update(Dog dog) {
        Session session = factory.getCurrentSession();
        session.update(dog);
        return true;
    }

    @Override
    public boolean delete(Dog dog) {
        Session session = factory.getCurrentSession();
        session.delete(dog);
        return true;
    }

    @Override
    public List<Dog> findAll() {
        Session session = factory.getCurrentSession();
        return (List<Dog>) session.createCriteria(Dog.class).list();
    }
}
