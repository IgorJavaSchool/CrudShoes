package com.yanevskyy.dao;

import com.yanevskyy.shoesFactory.Shoes;

import java.util.List;

/**
 * @author Yanevskyy Igor igor2000@inbox.ru.
 */
public interface ShoesDao {
    public void addShoes(Shoes shoes);
    public void updateShoes(Shoes shoes);
    public void removeShoes(int id);
    public Shoes getShoesById(int id);
    public List<Shoes> getShoesList();
}

