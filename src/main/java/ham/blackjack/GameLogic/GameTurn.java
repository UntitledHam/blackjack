package ham.blackjack.GameLogic;

import java.io.IOException;

public class GameTurn {
    Deck deck;
    Hand playerCards; 
    Hand dealerCards; 

    public GameTurn() throws IOException{
        deck = new Deck();
        playerCards = new Hand();
        dealerCards = new Hand();
    }

    public void draw() {
        playerCards.draw(deck.draw());
        int score = playerCards.getScore();
        if (score == 21) {
            win();
        }
        else if (score > 21) {
            bust();
        }
    } 

    public void drawOpponentCards() {
        while (dealerCards.getScore() < 17) {
            dealerCards.draw(deck.draw());
        }
        if (dealerCards.getScore() > 21) {
            dealerBust();
        }
        else if (dealerCards.getScore() > playerCards.getScore()) {
            dealerWin();
        }
        else {
            win();
        }
    }
    
    public void initialStart() {
        // Draw 2 cards.
        for (int i = 0; i < 2; i++) {
            draw();
            dealerCards.hideCards = true;
            dealerCards.draw(deck.draw());
        }
        
    }

    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Dealer's Cards:\n");
        str.append(dealerCards.toString());
        str.append("\nYour Cards:\n");
        str.append(playerCards.toString());
        return str.toString();
    }

    public void bust() {
        System.out.println("You bust lmao");
    }

    public void dealerBust() {
        System.out.println("The dealer busted lmao");
    }

    public void win() {
        System.out.println("You win");
    }

    public void dealerWin() {
        System.out.println("The dealer wins");
    }

    public void resetGame() {
        playerCards = new Hand();
        dealerCards = new Hand();
    }
}
