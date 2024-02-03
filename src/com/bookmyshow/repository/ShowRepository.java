package com.bookmyshow.repository;

import com.bookmyshow.models.Show;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.ArrayList;

public class ShowRepository {
    private TreeMap<Long, Set<Show>> shows;

    public ShowRepository() {
        this.shows = new TreeMap<>();
    }

    public void addShow(Show show) {
        shows.putIfAbsent(show.getStartTime(), new HashSet<>());
        shows.get(show.getStartTime()).add(show);
    }

    public List<Show> getShows(long start, long end) {
        List<Show> shows1 = new ArrayList<>();
        SortedMap<Long, Set<Show> > foundResult = this.shows.subMap(start, end);
        for (Long key: foundResult.keySet()) {
            shows1.addAll(new ArrayList<>(foundResult.get(key)));
        }
        return shows1;
    }

}
