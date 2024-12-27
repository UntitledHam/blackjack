package ham.blackjack.GameLogic;

import java.util.LinkedList;
import java.util.List;

public class Hand {
    private List<Card> cards;
    private int score;
    boolean hideCards;

    public Hand() {
        cards = new LinkedList<>();
        score = 0;
        hideCards = false;
    }

    public void setHideCards(boolean cardsHidden) {
        hideCards = cardsHidden;
    }

    public List<Card> getCards() {
        return cards;
    }

    public int getScore() {
        return score; 
    }

    public String toString() {
        if (cards.size() == 0) {
            return "";
        }
        StringBuilder str = new StringBuilder();
        str.append(cards.get(0).toString());
        for (int i = 1; i < cards.size(); i++) {
            str.append(" ");
            if (hideCards) {
                str.append("?");
            }
            else {
                str.append(cards.get(i).toString());
            }
        }
        return str.toString();
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
