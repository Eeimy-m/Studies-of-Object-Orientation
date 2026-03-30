package SimulatedTest2.game;
import SimulatedTest2.deck.Card;

public class Player {
    private final int QUANT_OF_CARDS = 3;

    private String name;
    private int score;
    private Card[] cards;
    private int cardsCont;

    public Player(String name) {
        this.name = name;
    }

    public void setCards(Card[] cards) {
        this.cards = cards;
        this.cardsCont = QUANT_OF_CARDS;
    }

    public Card cooseCard() {
        int cardIndex = cardsCont - 1;
        cardsCont--;
        return cards[cardIndex];
    }

    public void incremetScore() {
        score++;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public Card[] getCards() {
        return cards;
    }
}