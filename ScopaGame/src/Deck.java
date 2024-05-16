import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cards;

    public Deck() {
        String[] suits = {"Copas", "Oros", "Espadas", "Bastos"};
        String[] values = {"1", "2", "3", "4", "5", "6", "7", "Sota", "Caballo", "Rey"};

        cards = new ArrayList<>();

        for (String suit : suits) {
            for (String value : values) {
                cards.add(new Card(suit, value));
            }
        }
    }

    public void shuffle(int times) {
        for (int i = 0; i < times; i++) {
            Collections.shuffle(cards);
        }
    }

    public void deal(List<Player> players, int cardsPerPlayer) {
        int playerIndex = 0;
        for (int i = 0; i < cardsPerPlayer * players.size(); i++) {
            if (cards.isEmpty()) {
                break; // Tüm kartlar dağıtıldıysa döngüyü kır
            }
            players.get(playerIndex).addCard(cards.remove(0));
            playerIndex = (playerIndex + 1) % players.size();
        }
    }

    public List<Card> getCards() {
        return cards;
    }

    @Override
    public String toString() {
        StringBuilder deckString = new StringBuilder();
        for (Card card : cards) {
            deckString.append(card).append("\n");
        }
        return deckString.toString();
    }
}
