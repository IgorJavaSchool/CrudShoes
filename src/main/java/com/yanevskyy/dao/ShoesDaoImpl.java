package com.yanevskyy.dao;

import com.yanevskyy.shoesFactory.Shoes;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Yanevskyy Igor igor2000@inbox.ru.
 */
@Repository
public class ShoesDaoImpl implements ShoesDao {
    private static final Logger LOGGER = LoggerFactory.getLogger(ShoesDaoImpl.class);

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addShoes(Shoes shoes) {

    }

    @Override
    public void updateShoes(Shoes shoes) {

    }

    @Override
    public void removeShoes(int id) {

    }

    @Override
    public Shoes getShoesById(int id) {
        return null;
    }

    @Override
    public List<Shoes> getShoesList() {
        return null;
    }
}
