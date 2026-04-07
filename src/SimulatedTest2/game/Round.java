package SimulatedTest2.game;

import SimulatedTest2.deck.Card;

public class Round {
    private String winner;

    public Round(String player1, Card card1, String player2, Card card2, Card vira) {
        int result = card1.compareValueTo(card2, vira);
    }

    public String getWinner() {
        return winner;
    }
}
