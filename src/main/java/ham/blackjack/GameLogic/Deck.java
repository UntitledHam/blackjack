package ham.blackjack.GameLogic;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import ham.blackjack.JsonUtil.DeckDataIO;

public class Deck {
    List<Card> cards;

    public Deck() throws IOException {
        cards = new ArrayList<>();
        addDeck();
    }

    public void addDeck() throws IOException {
        cards.addAll(DeckDataIO.buildDeckFromJsonFile("src/main/resources/json/Deck.json"));
        shuffleDeck();
    }

    public void shuffleDeck() {
        Collections.shuffle(cards);
    }
}
