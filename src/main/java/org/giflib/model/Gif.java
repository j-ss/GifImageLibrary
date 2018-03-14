package org.giflib.model;

import java.time.LocalDate;

public class Gif {

  private String name;
  private LocalDate uploadDate;
  private String username;
  private boolean favorite;

  public Gif() {
  }

  public Gif(String name, LocalDate uploadDate, String username, boolean favorite) {
    this.name = name;
    this.uploadDate = uploadDate;
    this.username = username;
    this.favorite = favorite;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LocalDate getUploadDate() {
    return uploadDate;
  }

  public void setUploadDate(LocalDate uploadDate) {
    this.uploadDate = uploadDate;
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
