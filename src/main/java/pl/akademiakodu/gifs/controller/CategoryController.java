package pl.akademiakodu.gifs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pl.akademiakodu.gifs.model.Category;
import pl.akademiakodu.gifs.model.Gif;
import pl.akademiakodu.gifs.repository.CategoryRepository;
import pl.akademiakodu.gifs.repository.GifRepository;

import java.util.List;

public class CategoryController {


    @Autowired
    CategoryRepository categoryRepository;

    @GetMapping("/categories")
    public String gifCategories( ModelMap modelMap){
        //1. Wyciagniecie gifa

        List<Category> categoryList= categoryRepository.getAllCategories();

        //2. przekazanie do view

        modelMap.put("categories",categoryList);

        //3. zwrocenie widoku

        return  "categories";
    }







}
