package com.bookmyshow.models;

import java.util.List;

public class Theatre {
    private String name;
    private Location location;
    private List<Hall> halls;
    private int totalHalls;

    public Theatre(String name, Location location, int totalHalls) {
        this.name = name;
        this.location = location;
        this.totalHalls = totalHalls;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public List<Hall> getHalls() {
        return halls;
    }

    public boolean addHall(Hall hall) {
        if (this.halls.size() < totalHalls) {
            this.halls.add(hall);
            return true;
        }

        return false;
    }

    public int getTotalHalls() {
        return totalHalls;
    }

    public void setTotalHalls(int totalHalls) {
        this.totalHalls = totalHalls;
    }
}
