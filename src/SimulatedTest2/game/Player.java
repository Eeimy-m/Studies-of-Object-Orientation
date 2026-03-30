package SimulatedTest2.game;
import SimulatedTest2.deck.Card;

public class Player {
    private final int QUANT_OF_CARDS = 3;

    private String name;
    private int score;
    private Card[] cards;

    public Player(String name) {
        this.cards = new Card[QUANT_OF_CARDS];
        this.name = name;
    }

    public Card cooseCard() {
        //retorna uma das cartas, não
        //deixando-a disponível para ser jogada novamente durante a mesma mão.

    }

    public void incremetScore() {

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

    public void setCards(Card[] cards) {
        this.cards = cards;
    }
}