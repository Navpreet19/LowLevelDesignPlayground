package com.bookmyshow.service.impl;

import com.bookmyshow.models.Show;
import com.bookmyshow.service.SearchService;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class SearchServiceImpl implements SearchService {
    private ShowServiceImpl showService;

    public SearchServiceImpl() {
        this.showService = new ShowServiceImpl();
    }

    public SearchServiceImpl(ShowServiceImpl showService) {
        this.showService = showService;
    }

    public List<Show> searchByMovie(String movieName, Instant date) {
        // return shows by movie name
        Instant start = date;
        Instant end = date.plus(Duration.ofDays(1));

        List<Show> shows = new ArrayList<>();
        List<Show> allShows = this.showService.getShows(start, end);

        for(Show show: allShows){
            if(show.getMovie().getName().startsWith(movieName)){
                shows.add(show);
            }
        }
        return shows;
    }
}
