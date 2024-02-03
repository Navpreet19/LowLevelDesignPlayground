package com.bookmyshow.models;

public class Movie {
//    private String id;
    private String name;
    private String description;
    private String releaseDate;

    public Movie(String name) {
//        this.id = id;
        this.name = name;
//        this.description = description;
//        this.releaseDate = releaseDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
