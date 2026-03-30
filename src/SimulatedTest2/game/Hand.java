package SimulatedTest2.game;

import SimulatedTest2.deck.Card;

public class Hand {
    private final int PLAYERS_IN_GAME = 2;
    private final int MAX_QUANT_OF_ROUNDS = 3;

    private Card hand;
    private Player[] players;
    private Round[] rounds;

    public Hand(Player player1, Player player2) {
        this.rounds = new Round[MAX_QUANT_OF_ROUNDS];
        this.players = new Player[PLAYERS_IN_GAME];
        players[0] = player1;
        players[1] = player2;
    }

    public void playRound() {

    }

//    public boolean isDone() {
//
//    }
//
//    public String getWinner() {
//
//    }

    public Card getCard() {
        return hand;
    }

    public Player[] getPlayers() {
        return players;
    }
}
