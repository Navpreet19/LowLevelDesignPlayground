package com.bookmyshow.models;

import com.bookmyshow.constants.Screen;

import java.util.ArrayList;
import java.util.List;

public class Hall {
    private String id;
    private Theatre theatre;
    private Screen screen;
    private int totalSeats;
    private List<Seat> seats;

    public Hall(String id, Theatre theatre, Screen screen, int totalSeats) {
        this.id = id;
        this.theatre = theatre;
        this.screen = screen;
        this.totalSeats = totalSeats;
        this.seats = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Theatre getTheatre() {
        return theatre;
    }

    public void setTheatre(Theatre theatre) {
        this.theatre = theatre;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public boolean addSeat(Seat seat){
        if ( this.seats.size() < totalSeats) {
            this.seats.add(seat);
            return true;
        }
        return false;
    }
}
