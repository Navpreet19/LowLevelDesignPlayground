package com.cards;

import com.cards.constants.Suit;
import com.cards.models.Card;
import com.cards.models.Deck;
import com.cards.models.Player;
import com.cards.service.WinnerService;
import com.cards.service.impl.WinnerServiceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.cards.constants.Suit.JOKER;

public class Application {
    public static void main(String[] args) {
        System.out.println("Hello World");

        // Create a deck of cards
        Deck deck = new Deck();
        for (Suit suit : Suit.values()) {
            if ( suit != JOKER) {
                for (int i = 1; i <= 13; i++) {
                    deck.addCard(new Card(i, suit));
                }
            }
        }
        deck.addCard(new Card(1, JOKER));
        deck.addCard(new Card(1, JOKER));

        // Print the cards
        deck.printCards();

        // Shuffle the cards
        deck.shuffle();
        deck.printCards();


        // Create a list of players and deal 5 cards to each player and print the cards
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        List<Player> players = new ArrayList<>();
        for (String name : names) {
            players.add( new Player(name, new Deck()) );
        }

        for (Player player : players) {
            for (int i = 0; i < 5; i++) {
                player.getDeck().addCard(deck.getCards().remove(0));
            }
        }

        for (Player player : players) {
            System.out.println(player.getName());
            player.getDeck().printCards();
        }


//        shuffle the deck and deal 5 cards to each player and print the cards
        deck.shuffle();
        for (Player player : players) {
            for (int i = 0; i < 5; i++) {
                player.getDeck().addCard(deck.getCards().remove(0));
            }
        }

        for (Player player: players) {
            System.out.println(player.getName());
            player.getDeck().printCards();
        }

        // Winner
        WinnerService winnerService = new WinnerServiceImpl();
        Player winner = winnerService.getWinner(players);
        System.out.println("Winner: " + winner.getName() + " " + winner.getScore());
    }
}
