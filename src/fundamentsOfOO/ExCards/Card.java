package fundamentsOfOO.ExCards;

public class Card {
    public enum CardSuit {DIAMONDS, SPACES, CLUBS, HEARTS, HIDDEN} // TODO aqui você está declarando o Tipo do enum, não uma variável
    public enum CardRank {ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, QUEEN, JACK, KING, HIDDEN}

    private CardSuit suit; // TODO aqui sim você está declarando uma variável para guardar um valor do tipo Suit (enum)
    private CardRank rank; // TODO mesma coisa.
    boolean faceUp;

    public Card(boolean facecUp, CardSuit suit, CardRank rank) {
        this.faceUp = faceUp;
        suit = suit; // TODO Se a car this.cardSuit = suit; para evitar shadowing (this.suit aponta para o atributo, enquanto apenas suit se refere o parâmetro
        rank = rank; // TODO mesma coisa.
        // TODO evite deixar espaços em branco desnecessários.
    }

    // TODO desenvolver o método public String asString() que retorna o estado do objeto como string. Por exemplo, algo como "K de Paus aberto" / "5 de Ouros fechado".
    // TODO métodos getter retornam o mesmo tipo do atributo e não devem receber parâmetro
    public String asString(boolean faceUp, CardSuit suit, CardRank rank) {
        String output = null;
        String suitString = suit.toString();
        String rankAsString = rank.toString();

        if(faceUp)
            return output = String.format("%s %s faced up", rankAsString, suitString);

        else
            return output = String.format("%s %s hidden", rankAsString, suitString);
    }

    // TODO esses são exemplos de getters
    public CardSuit getSuit() {
        return suit;
    }

    public CardRank getRank() {
        return rank;
    }

    public boolean isFaceUp() {
        return faceUp;
    }
}
