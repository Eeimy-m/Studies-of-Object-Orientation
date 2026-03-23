package fundamentsOfOO.ExCards;

public class Deck {
    Card[] cards = new Card[52];

    public Deck(Card[] cards) {
        this.cards = cards;
    }

    public Card[] getCards() {
        return cards;
    }
    // TODO criar um array de cartas para gerar as 52 combinações possíveis (ok)
    // TODO criar um método para retirar uma carta do baralho e retornar para quem pediu (?)
    // TODO criar um método para retirar n cartas do baralho, retornando-as para quem pediu. (ok)
}
