package pl.akademiakodu.gifs.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.akademiakodu.gifs.repository.GifRepository;

import java.util.Arrays;

@Controller
public class MainController {

    @Autowired
    GifRepository gifRepository;

    @GetMapping("/")
    @ResponseBody
    public String hello(){
        return "dziala";
    }

    @GetMapping("/showgifsinbrowser")
    @ResponseBody
    public String showGifNames(){
        return gifRepository.getGifsNames();
    }


}
