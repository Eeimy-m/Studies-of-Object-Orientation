package fundamentsOfOO.ExCards;

public class Deck {
    public static final int NUMBER_OF_CARDS = 52;
    private Card[] cards = new Card[NUMBER_OF_CARDS];
    private int cont;

    public Deck() {
        createCards();
    }

    private void createCards() {
        for (Card.CardRank rank : Card.CardRank.values()) {
            for(Card.CardSuit suit : Card.CardSuit.values()) {
                cards[cont] = new Card(true, suit, rank);
                cont++;
            }
        }
    }

    public Card takeOne() {
        Card card = cards[cont - 1];
        cards[cont - 1] = null;
        cont--;
        return card;
    }
    
    public Card[] takeMany(int quantity) {
        Card[] cardsToReturn = new Card[quantity];
        
        for(int i = 0; i < quantity; i++) {
            cardsToReturn[i] = takeOne();
        }
        
        return cardsToReturn;
    }
    
    public Card[] getCards() {
        return cards;
    }
    // TODO criar um array de cartas para gerar as 52 combinações possíveis (ok)
    // TODO criar um método para retirar uma carta do baralho e retornar para quem pediu (?)
    // TODO criar um método para retirar n cartas do baralho, retornando-as para quem pediu. (ok)
}
