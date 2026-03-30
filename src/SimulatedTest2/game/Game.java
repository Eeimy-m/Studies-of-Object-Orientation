package SimulatedTest2.game;

public class Game {
    private final int PLAYERS_IN_GAME = 2;
    private final int HANDS_IN_GAME = 30;

    private Player[] playersOfGame;
    private Hand[] hands;

    public Game(Player player1, Player player2) {
        playersOfGame = new Player[PLAYERS_IN_GAME];
        hands = new Hand[HANDS_IN_GAME];
        playersOfGame[0] = player1;
        playersOfGame[1] = player2;
    }

    public void play() {

    }

//    public boolean isDone() {
//
//    }
//
//    public Player getWinner() {
//
//    }
}
