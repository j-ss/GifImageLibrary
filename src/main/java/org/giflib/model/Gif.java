package org.giflib.model;

import java.time.LocalDate;

public class Gif {

  private String name;
  private LocalDate dateUploaded;
  private String username;
  private boolean favorite;
  private int category;

  public Gif() {
  }

  public Gif(String name,int id, LocalDate uploadDate, String username, boolean favorite) {
    this.name = name;
    this.dateUploaded = uploadDate;
    this.username = username;
    this.favorite = favorite;
    this.category=id;
  }

  public int getCategory() {
    return category;
  }

  public void setCategory(int category) {
    this.category = category;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LocalDate getDateUploaded() {
    return dateUploaded;
  }

  public void setDateUploaded(LocalDate uploadDate) {
    this.dateUploaded = uploadDate;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public boolean isFavorite() {
    return favorite;
  }

  public void setFavorite(boolean favorite) {
    this.favorite = favorite;
  }
}
