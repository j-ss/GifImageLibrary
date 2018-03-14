package org.giflib.controller;

import org.giflib.dao.CategoryRepository;
import org.giflib.dao.GifRepository;
import org.giflib.model.Category;
import org.giflib.model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Locale;

@Controller
public class CategoryController {
  @Autowired
  private CategoryRepository categoryRepository;
  @Autowired
  private GifRepository gifRepository;

  @RequestMapping("/categories")
  public String listCategory(ModelMap modelMap){
        List<Category> categorys=categoryRepository.getAllCategories();
        modelMap.put("categories",categorys);
        return "categories";
  }

  @RequestMapping(value = "/category/{id}")
  public String category(@PathVariable int id,ModelMap modelMap){

    Category category=categoryRepository.findById(id);
    modelMap.put("category",category);
    List<Gif> gifs=gifRepository.listGifs(id);
    modelMap.put("gifs",gifs);
    return "category";

  }
}
