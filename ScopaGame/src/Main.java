import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your birthday in days (1-31): ");
        int birthday = scanner.nextInt();

        Deck deck = new Deck();

        deck.shuffle(birthday);

        Player player1 = new Player("İsmet");
        Player player2 = new Player("Arda");

        List<Player> players = new ArrayList<>();
        players.add(player1);
        players.add(player2);

        int cardsPerPlayer = 20;
        deck.deal(players, cardsPerPlayer);

        for (Player player : players) {
            System.out.println(player);
        }

        int player1Points = player1.getHandOdd().size() + player1.getHandEven().size();
        int player2Points = player2.getHandOdd().size() + player2.getHandEven().size();

        System.out.println("Player 1 (" + player1.getHandOdd().size() + " odd, " + player1.getHandEven().size() + " even): " + player1Points + " points");
        System.out.println("Player 2 (" + player2.getHandOdd().size() + " odd, " + player2.getHandEven().size() + " even): " + player2Points + " points");

        if (player1Points > player2Points) {
            System.out.println("Player 1 wins!");
        } else if (player2Points > player1Points) {
            System.out.println("Player 2 wins!");
        } else {
            System.out.println("It's a tie!");
        }

        scanner.close();
    }
}
