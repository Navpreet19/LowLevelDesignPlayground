package com.bookmyshow.service;

import com.bookmyshow.models.Show;

import java.time.Instant;
import java.util.List;

public interface SearchService {
    List<Show> searchByMovie(String movieName, Instant date);
}
