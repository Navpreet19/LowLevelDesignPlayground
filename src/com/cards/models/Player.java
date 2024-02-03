package com.cards.models;

public class Player {
    private String name;
    private Deck deck;

    public Player(String name, Deck deck) {
        this.name = name;
        this.deck = deck;
    }

    public String getName() {
        return name;
    }

    public Deck getDeck() {
        return deck;
    }

    public int getScore() {
        int score = 0;
        for (Card card : deck.getCards()) {
            if (card.getNumber() > 10 || card.getNumber() == 1) {
                score += card.getNumber();
            }
        }
        return score;
    }
}
