package com.example.gifsproject.model;

public class Gif {

    private String name;
    private boolean favorite;

    public Gif() {
    }

    public Gif(String name, boolean favorite) {
        this.name = name;
        this.favorite = favorite;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }

    @Override
    public String toString() {
        return "Gif{" +
                "name='" + name + '\'' +
                ", favorite=" + favorite +
                '}';
    }
}
