package org.giflib.controller;

import org.giflib.model.Gif;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDate;

@Controller
public class HomeController {

  @RequestMapping(value="/")
  public String listGif(ModelMap modelMap){
    Gif gif=new Gif("compiler-bot", LocalDate.of(2018,05,25),"jogendra",false);
    modelMap.put("gifs",gif);
    return "home";
  }

  @RequestMapping("/gif")
  public String gifDetails(ModelMap modelMap){
    Gif gif=new Gif("compiler-bot", LocalDate.of(2018,05,25),"jogendra",false);
    modelMap.put("gif",gif);
    return "gif-details";
  }
}
