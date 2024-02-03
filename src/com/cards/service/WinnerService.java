package com.cards.service;

import com.cards.models.Player;

import java.util.List;

public interface WinnerService {
    Player getWinner(List<Player> players);
}
