package com.yanevskyy.service;

import com.yanevskyy.dao.ShoesDao;
import com.yanevskyy.shoesFactory.Shoes;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by MM on 20.11.2016.
 */
@Service
public class ShoesServiceImpl implements ShoesService{
    private ShoesDao shoesDao;

    public void setShoesDao(ShoesDao shoesDao) {
        this.shoesDao = shoesDao;
    }

    @Override
    @Transactional
    public void addShoes(Shoes shoes) {
        this.shoesDao.addShoes(shoes);
    }

    @Override
    @Transactional
    public void updateShoes(Shoes shoes) {
        this.shoesDao.updateShoes(shoes);

    }

    @Override
    @Transactional
    public void removeShoes(int id) {
        this.shoesDao.removeShoes(id);
    }

    @Override
    @Transactional
    public Shoes getShoesById(int id) {
        return this.shoesDao.getShoesById(id);
    }

    @Override
    @Transactional
    public List<Shoes> getShoesList() {
        return this.shoesDao.getShoesList();
    }
}
