package ham.blackjack.GameLogic;

import java.util.LinkedList;
import java.util.List;

public class Hand {
    private List<Card> cards;
    private int score;

    public Hand() {
        cards = new LinkedList<>();
        score = 0;
    }

    public List<Card> getCards() {
        return cards;
    }

    public int getScore() {
        return score; 
    }

    public void draw(Card card) {
        cards.add(card);
        score += card.getRank();
        if (score > 21) {
            for (Card c : cards) {
                if (c.getAdditionalRank().equals("Ace") && c.getRank() != 1) {
                    c.setRank(1);
                    score -= 10;
                    return;
                }
            }
        }
    }
}
