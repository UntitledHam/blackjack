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

    public String getSuit() {
        return suit;
    }

    public int getRank() {
        return rank;
    }

    public String getAdditionalRank() {
        return additionalRank;
    }

}
