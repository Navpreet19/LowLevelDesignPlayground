package com.cards.models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cards;

    public Deck() {
        this.cards = new ArrayList<>();
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public List<Card> getCards() {
        return cards;
    }

    public void addCard(Card card) {
        this.cards.add(card);
    }

    public void printCards() {
        for (Card card : this.cards) {
            System.out.println(card.getNumber() + " " + card.getSuit());
        }
//        Print a newline
        String newline = System.getProperty("line.separator");
        System.out.println(newline);
    }
}
