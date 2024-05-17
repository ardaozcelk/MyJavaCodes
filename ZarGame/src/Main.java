import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Gamer gamer1 = new Gamer();
        Gamer gamer2 = new Gamer();

        System.out.println("GAME RULES ! ! !");
        System.out.println("Each player rolls the dice 5 times and the highest score wins");
        System.out.println("Enter Player 1's Name : ");
        gamer1.setName(scan.nextLine());
        System.out.println("Enter Player 1's Surname : ");
        gamer1.setSurname(scan.nextLine());

        System.out.println("Enter Player 2's Name : ");
        gamer2.setName(scan.nextLine());
        System.out.println("Enter Player 2's Surname : ");
        gamer2.setSurname(scan.nextLine());

        for(int i=0;i<5;i++)
            gamer1.ZarAt();

        for(int i=0;i<5;i++)
            gamer2.ZarAt();

        System.out.println("Player 1 Name : "+gamer1.getName()+" "+gamer1.getSurname());
        System.out.println("Player1 Point : "+gamer1.getPoint());
        System.out.println(" ");
        System.out.println("Player 2 Name: "+gamer2.getName()+" "+gamer2.getSurname());
        System.out.println("Player2 Point : "+gamer2.getPoint());
        System.out.println("------------------------------------------------");
        if(gamer1.getPoint() > gamer2.getPoint())
            System.out.println("Player 1 WON ! ! !");
        else if (gamer1.getPoint() < gamer2.getPoint())
            System.out.println("Player 2 WON ! ! !");
        else System.out.println("DRAW ! ! !");

    }
}