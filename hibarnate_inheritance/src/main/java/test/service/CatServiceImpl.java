package test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.domain.Cat;
import test.dao.CatDao;

import java.util.List;

/**
 * Created by Chuvychin on 25.04.2015.
 */
@Service
public class CatServiceImpl implements CatService {

    @Autowired
    private CatDao catDao;

    public CatServiceImpl() {

    }

    @Override
    public boolean create(Cat cat) {
        catDao.create(cat);
        return true;
    }

    @Override
    public boolean update(Cat cat) {
        return false;
    }

    @Override
    public boolean delete(Cat cat) {
        return false;
    }

    @Override
    public List<Cat> findAll() {
        return catDao.findAll();
    }
}
