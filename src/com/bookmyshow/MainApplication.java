package com.bookmyshow;

import com.bookmyshow.models.Hall;
import com.bookmyshow.models.Movie;
import com.bookmyshow.models.Seat;
import com.bookmyshow.models.Theatre;
import com.bookmyshow.models.Location;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.bookmyshow.constants.Screen.VIPER;

class MainApplication {
    public static void addSeats(Hall hall) {
        for (int i=0; i<hall.getTotalSeats(); i++) {
            for (int j=0; j<10; j++) {
                hall.addSeat(new Seat(i, j, hall));
            }
        }
    }
    public static void main (String[] args) {
        List<String> movieNames = Arrays.asList(
                "The Equalizer 3",
                "Barbie",
                "Mission Impossible Dead Reckoning",
                "Oppenheimer",
                "Asteroid City",
                "Gran Turismo",
                "Blue Beetle",
                "Goldfish"
        );

        List<Movie> movies = new ArrayList<>();
        for (String name: movieNames) {
            movies.add(new Movie(name));
        }

        List<String> theatreNames = Arrays.asList(
                "PVR Vega City",
                "PVR Nexus Kormangala",
                "INOX Mantri Square",
                "Cinepolis Nexus Shantiniketan",
                "INOX Galleria Mall"
        );

        Location location = new Location("Bengaluru", "560095", "Dummy Address");

        List<Theatre> theatres = new ArrayList<>();
        for (String name: theatreNames) {
            theatres.add(new Theatre(name, location, 5));
        }

        for (Theatre theatre: theatres) {
            for (int h=0; h<theatre.getTotalHalls(); h++) {
                Hall hall = new Hall(String.valueOf(h), theatre, VIPER, 100);
                theatre.addHall(hall);
                addSeats(hall);
            }
        }




        System.out.println("Happy Happy");
    }
}