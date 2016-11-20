package com.yanevskyy.service;

import com.yanevskyy.shoesFactory.Shoes;

import java.util.List;

/**
 * Created by MM on 20.11.2016.
 */
public interface ShoesService {
    public void addShoes(Shoes shoes);
    public void updateShoes(Shoes shoes);
    public void removeShoes(int id);
    public Shoes getShoesById(int id);
    public List<Shoes> getShoesList();
}
