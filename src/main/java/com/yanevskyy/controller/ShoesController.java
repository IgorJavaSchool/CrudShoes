package com.yanevskyy.controller;

import com.yanevskyy.service.ShoesService;
import com.yanevskyy.shoesFactory.Shoes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by MM on 20.11.2016.
 */
@Controller
public class ShoesController {
    private ShoesService shoesService;

    @Autowired(required = true)
    @Qualifier(value = "shoesService")
    public void setShoesService(ShoesService shoesService) {
        this.shoesService = shoesService;
    }

    @RequestMapping(value = "shoes", method = RequestMethod.GET)
    public String listShoes(Model model){
        model.addAttribute("shoes", new Shoes());
        model.addAttribute("listShoes", shoesService.getShoesList());
        return "shoes";
    }

    @RequestMapping(value = "/shoes/add", method = RequestMethod.POST)
    public String addShoes(@ModelAttribute("shoes") Shoes shoes){
        if (shoes.getId() == 0){
            this.shoesService.addShoes(shoes);
        }else {
            this.shoesService.updateShoes(shoes);
        }

        return "redirect:/shoes";
    }

    @RequestMapping("/remove/{id}")
    public String removeShoes(@PathVariable("id") int id){
        this.shoesService.removeShoes(id);

        return "redirect:/shoes";
    }

    @RequestMapping("edit/{id}")
    public String editShoes(@PathVariable("id") int id, Model model){
        model.addAttribute("shoes", shoesService.getShoesById(id));
        model.addAttribute("listShoes", this.shoesService.getShoesList());

        return "shoes";
    }

    @RequestMapping("shoesdata/{id}")
    public String shoesData(@PathVariable("id") int id, Model model){
        model.addAttribute("shoes", this.shoesService.getShoesById(id));
        return "shoesData";
    }
}
