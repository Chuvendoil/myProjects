package test.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import test.domain.Cat;

import java.util.List;

/**
 * Created by Chuvychin on 19.04.2015.
 */
@Transactional
@Repository
public class CatDaoImpl implements CatDao{

    @Autowired
    private SessionFactory factory;

    public CatDaoImpl() {
    }

    @Override
    public boolean create(Cat cat) {
        Session session = factory.getCurrentSession();
        session.save(cat);
        return true;
    }

    @Override
    public boolean update(Cat cat) {
        Session session = factory.getCurrentSession();
        session.update(cat);
        return true;
    }

    @Override
    public boolean delete(Cat cat) {
        Session session = factory.getCurrentSession();
        session.delete(cat);
        return true;
    }

    @Override
    public List<Cat> findAll() {
        Session session = factory.getCurrentSession();
        return (List<Cat>) session.createCriteria(Cat.class).list();
    }
}
