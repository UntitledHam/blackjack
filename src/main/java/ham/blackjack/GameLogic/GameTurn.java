package ham.blackjack.GameLogic;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class GameTurn {
    Deck deck;
    List<Card> playerCards; 
    List<Card> dealerCards; 
    int playerScore = 0;
    int dealerScore = 0;

    public GameTurn() throws IOException{
        deck = new Deck();
        playerCards = new LinkedList<>();
        dealerCards = new LinkedList<>();
    }

    public void draw() {
        Card card = deck.drawCard();
        playerCards.add(card);
        playerScore += card.getRank();
        if (playerScore > 21) {
            for (Card c : playerCards) {
                if (c.getAdditionalRank().equals("Ace") && c.getRank() != 1) {
                    c.setRank(1);
                    playerScore -= 10;
                    return;
                }
            }
        }
    }

    public int getPlayerScore() {
        return playerScore;
    }
}
