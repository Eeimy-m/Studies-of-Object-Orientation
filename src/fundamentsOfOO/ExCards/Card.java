package fundamentsOfOO.ExCards;

public class Card {
    public enum CardSuit {DIAMONDS, SPACES, CLUBS, HEARTS, HIDDEN} // TODO aqui você está declarando o Tipo do enum, não uma variável

    public enum CardRank {ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, QUEEN, JACK, KING, HIDDEN}

    private final CardSuit suit;
    private final CardRank rank;
    boolean faceUp;

    public Card(boolean faceUp, CardSuit suit, CardRank rank) {
        this.faceUp = faceUp;
        this.suit = suit;
        this.rank = rank;
    }

    public String asString() {
        return String.format("%s %s %s", rank.toString(), suit.toString(), faceUp? "Faced up" : "hidden");
    }

    public CardSuit getSuit() {
        return suit;
    }

    public CardRank getRank() {
        return rank;
    }

    public boolean isFaceUp() {
        return faceUp;
    }

    public void faceUp() {
        faceUp = true;
    }

    public void faceDown() {
        faceUp = false;
    }
}
