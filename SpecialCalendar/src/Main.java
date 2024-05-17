import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name, surname, number, gender, birthdate;
        int weeks;
        System.out.println("Enter your name : ");
        name = scan.next();
        System.out.println("Enter your surname : ");
        surname = scan.next();
        System.out.println("Enter your number : ");
        number = scan.next();
        System.out.println("State your gender : Male Or Female ");
        gender = scan.next();

        if (gender.equalsIgnoreCase("Male")) // equalsIgnoreCase ifadesi strginlerde kıyaslama yaparken büyük küçük harf farkını dikkate almaz.
            weeks = 8;
        else if (gender.equalsIgnoreCase("Female"))
            weeks = 5;
        else System.out.println("Undefined gender. Please define correctly...");

        System.out.println("State your birthdate : (GG.AA.YYYY) ");
        birthdate = scan.next();
        String[] birthdateParts = birthdate.split("\\.");
        int year = Integer.parseInt(birthdateParts[2]);
        int age = 2024 - year;

        if (year <= 18) weeks = 5;
        else weeks = 6;

        String jobDate;
        System.out.println("Please Enter Your Job Date : (GG.AA.YYYY) ");
        jobDate = scan.next();
        String[] jobDateParse = jobDate.split("\\.");
        int day = Integer.parseInt(jobDateParse[0]);
        int month = Integer.parseInt(jobDateParse[1]);

        String dear = (gender.equalsIgnoreCase("Male")) ? "Mr." : "Ms.";
        System.out.println("Dear " + dear + " " + name + " " + surname + " , you are " + age + " years old and you have a job on the " + day + "th day of the " + month + "th month.");
    }
}
