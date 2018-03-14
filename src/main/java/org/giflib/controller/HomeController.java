package org.giflib.controller;

import org.giflib.dao.GifRepository;
import org.giflib.model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDate;
import java.util.List;

@Controller
public class HomeController {

  @Autowired
  private GifRepository gifRepository;
  @RequestMapping(value="/")
  public String listGif(ModelMap modelMap){
    List<Gif> gifs=gifRepository.getAllGifs();
    modelMap.put("gifs",gifs);
    return "home";
  }

  @RequestMapping("/gif/{name}")
  public String gifDetails(@PathVariable String name , ModelMap modelMap){
   Gif gif=gifRepository.findByName(name);
    modelMap.put("gif",gif);
    return "gif-details";
  }
}
