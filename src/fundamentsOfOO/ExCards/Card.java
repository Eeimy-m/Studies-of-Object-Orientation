package fundamentsOfOO.ExCards;

public class Card {
    public enum Suit {DIAMONDS, SPACES, CLUBS, HEARTS, HIDDEN}
    public enum Rank {ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, QUEEN, JACK, KING, HIDDEN}
    boolean faceUp;

    public Card(boolean facecUp, Suit suit, Rank rank) {
        this.faceUp = faceUp;
    }

    String ifFaceUp(String suit, String rank, boolean faceUp) {
        String output = null;

        if(faceUp)
            output = "Is faced up";
        else
            output = "Is not faced up";

        return output;
    }
}
