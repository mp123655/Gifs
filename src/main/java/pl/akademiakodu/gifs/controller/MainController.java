package pl.akademiakodu.gifs.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.akademiakodu.gifs.model.Gif;
import pl.akademiakodu.gifs.repository.GifRepository;

import java.util.Arrays;
import java.util.List;

@Controller
public class MainController {

    @Autowired
    GifRepository gifRepository;

    @GetMapping("/")

    public String hello(ModelMap modelMap){

        //praca z Thymlifem:
        //1. Wyciagniecie gifow

        List<Gif> gifList= gifRepository.getGifs();

        //2. przekazanie do view
        modelMap.put("gifs",gifList); // laczy frontend z backendem. jako klucz nazwa z forntendu, wartosc z backendu

        //3. zwrocenie widoku

        return "home"; // nazwa pliku html, ale bez rozszerzenia
    }

    @GetMapping("/showgifsinbrowser")
    @ResponseBody
    public String showGifNames(){
        return gifRepository.getGifsNames();
    }

    @GetMapping("/favorites")
    public String favoritesGifts(ModelMap modelMap){
        //1. Wciagniecie gifs
        List<Gif> favoriteGifs=gifRepository.getFavoritesGifs();

        //2. Przekazanie do view

        modelMap.put("gifs",favoriteGifs);

        //3. zwrocenie widoku
        return "favorites";
    }

}
