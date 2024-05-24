import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        process main = new process();
        String process;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number : ");
        int number = scan.nextInt();
        int number2;

        List<Integer> backupInt = new ArrayList<>();
        List<String> backupStr = new ArrayList<>();
        backupInt.add(number);


        System.out.println("Please enter a transaction : ");
        System.out.println("+   -   *   /   fac   exp   prime");
        process = scan.next();

        switch (process) {
            case "+":
                System.out.println("Please enter a number : ");
                number2 = scan.nextInt();
                System.out.println("Result : " + main.collection(number, number2));
                backupInt.add(number2);
                break;
            case "-":
                System.out.println("Please enter a number : ");
                number2 = scan.nextInt();
                System.out.println("Result : " + main.decal(number, number2));
                backupInt.add(number2);
                break;
            case "*":
                System.out.println("Please enter a number : ");
                number2 = scan.nextInt();
                System.out.println("Result : " + main.multiplication(number, number2));
                backupInt.add(number2);
                break;
            case "/":
                System.out.println("Please enter a number : ");
                number2 = scan.nextInt();
                System.out.println("Result : " + main.divide(number, number2));
                backupInt.add(number2);
                break;
            case "fac":
                System.out.println("Result : " + main.factorial(number));
                break;
            case "exp":
                System.out.println("Please enter a number : ");
                number2 = scan.nextInt();
                System.out.println("Result : " + main.exponential(number, number2));
                backupInt.add(number2);
                break;
            case "prime":
                System.out.println("Result : " + main.primeNumber(number));
                break;
        }

        backupStr.add(process);
        System.out.println("Summary of Transactions");
        System.out.println(backupInt);
        System.out.println(backupStr);

    }
}