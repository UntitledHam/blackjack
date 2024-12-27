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

    public Card() {
        this.suit = null;
        this.rank = 0;
        this.additionalRank = null;
    }

    // public Card(String suit, int rank) {
    //     this.suit = suit;
    //     this.rank = rank;
    //     this.additionalRank = null;
    // }

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
                break;
            case "diamonds": 
                suitSymbol = "♦";
                break;
            case "spades":
                suitSymbol = "♠";
                break;
            case "clubs": 
                suitSymbol = "♣";
                break;
            default: 
                suitSymbol = "null";
                break;
        }
        switch(additionalRank) {
            case "King":
                rankSymbol = "K";
                break;
            case "Queen":
                rankSymbol = "Q";
                break;
            case "Jack": 
                rankSymbol = "J";
            case "Ace": 
                rankSymbol = "A";
                break;
            default:
                rankSymbol = "" + rank;
                break;
        }

        return suitSymbol + rankSymbol;
    }

}
