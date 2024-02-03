package com.cards.service.impl;

import com.cards.models.Player;
import com.cards.service.WinnerService;

import java.util.List;

public class WinnerServiceImpl implements WinnerService {
    public Player getWinner(List<Player> players) {
        Player winner = players.get(0);
        for (Player player : players) {
            if (player.getScore() > winner.getScore()) {
                winner = player;
            }
        }
        return winner;
    }
}
