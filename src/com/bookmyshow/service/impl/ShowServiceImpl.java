package com.bookmyshow.service.impl;

import com.bookmyshow.models.Show;
import com.bookmyshow.repository.ShowRepository;

import java.time.Instant;
import java.util.List;
import java.util.Objects;

public class ShowServiceImpl {
    private ShowRepository showRepository;
    public ShowServiceImpl () {
        this.showRepository = new ShowRepository();
    }
    void addShow(Show show) {
        Objects.requireNonNull(show);
        this.showRepository.addShow(show);
    }

    List<Show> getShows(Instant start, Instant end) {
        Objects.requireNonNull(start);
        Objects.requireNonNull(end);

        long startMillis = start.toEpochMilli();
        long endMillis = end.toEpochMilli();
        return this.showRepository.getShows(startMillis, endMillis);
    }
}
