package fundamentsOfOO;

public class Card {
    String suit, rank;
    boolean faceUp;

    public Card(String suit, String rank, boolean facecUp) {
        this.suit = suit;
        this.rank = rank;
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
