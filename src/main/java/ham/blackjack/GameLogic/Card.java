package ham.blackjack.GameLogic;

public class Card {
    private String suit;
    private int rank;
    private String additionalRank;

    public Card(String suit, int rank, String additionalRank) {
        this.suit = suit;
        this.rank = rank;
        this.additionalRank = additionalRank;
    }

    public Card(String suit, int rank) {
        this.suit = suit;
        this.rank = rank;
        this.additionalRank = null;
    }

    public String getSuit() {
        return suit;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
    public String getAdditionalRank() {
        return additionalRank;
    }

    public boolean isAce() {
        return additionalRank.equals("Ace");
    }

    public String toString() {
        String suitSymbol;
        String rankSymbol;
        switch(suit) {
            case "hearts":
                suitSymbol = "♥";
            case "diamonds": 
                suitSymbol = "♦";
            case "spades":
                suitSymbol = "♠";
            case "clubs": 
                suitSymbol = "♣";
            default: 
                suitSymbol = "null";
        }
        switch(additionalRank) {
            case "King":
                rankSymbol = "K";
            case "Queen":
                rankSymbol = "Q";
            case "Jack": 
                rankSymbol = "J";
            case "Ace": 
                rankSymbol = "A";
            default:
                rankSymbol = "" + rank;
        }

        return rankSymbol + suitSymbol;
    }

}
