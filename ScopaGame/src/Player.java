import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Player {
    private String name;
    private List<Card> handOdd;
    private ArrayList<Card> handEven;

    public Player(String name) {
        this.name = name;
        this.handOdd = new ArrayList<>();
        this.handEven = new ArrayList<>();
    }

    public void addCard(Card card) {
        int cardValue = convertCardValueToInt(card.getValue());
        if (cardValue % 2 == 0) {
            handEven.add(card);
        } else {
            handOdd.add(card);
        }
    }

    private int convertCardValueToInt(String value) {
        Map<String, Integer> cardValuesMap = new HashMap<>();
        cardValuesMap.put("1", 1);
        cardValuesMap.put("2", 2);
        cardValuesMap.put("3", 3);
        cardValuesMap.put("4", 4);
        cardValuesMap.put("5", 5);
        cardValuesMap.put("6", 6);
        cardValuesMap.put("7", 7);
        cardValuesMap.put("Sota", 8);
        cardValuesMap.put("Caballo", 9);
        cardValuesMap.put("Rey", 10);

        return cardValuesMap.getOrDefault(value, -1);
    }

    public List<Card> getHandOdd() {
        return handOdd;
    }

    public ArrayList<Card> getHandEven() {
        return handEven;
    }

    @Override
    public String toString() {
        StringBuilder handString = new StringBuilder(name + "'s hand:\n");
        handString.append("Odd cards: ").append(handOdd).append("\n");
        handString.append("Even cards: ").append(handEven).append("\n");
        return handString.toString();
    }
}
