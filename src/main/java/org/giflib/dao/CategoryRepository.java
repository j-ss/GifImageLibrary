package org.giflib.dao;

import org.giflib.model.Category;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class CategoryRepository {

  private List<Category> ALL_CATEGORY= Arrays.asList(
      new Category(1,"science"),
      new Category(2,"art"),
      new Category(3,"technology")
  );
  public List<Category> getAllCategories(){
   return ALL_CATEGORY;
  }
  public Category findById(int id){
    for(Category category:ALL_CATEGORY){
      if(category.getId()==id){
        return category;
      }
    }
    return  null;
  }
}
