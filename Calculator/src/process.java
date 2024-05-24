public class process {
    private int number1;
    private int number2;

    process() {
    }


    public int collection(int number1, int number2) {
        return number1 + number2;
    }

    public int decal(int number1, int number2) {
        return number1 - number2;
    }

    public int multiplication(int number1, int number2) {
        return number1 * number2;
    }

    public float divide(int number1, int number2) {
        return number1 / number2;
    }

    public long  factorial(int number1) {
        int total = 1;
        for (int i = 1; i <= number1; i++) {
            total = total * i;
        }
        return total;
    }

    public int exponential(int number1, int number2) {
        int total;
        total = (int) Math.pow(number1, number2);
        return total;
    }

    public boolean primeNumber(int number1) {
        int counter = 0;
        for (int i = 1; i < number1; i++) {
            if (number1 % i == 0) {
                counter++;
            }
        }
        if (counter > 2)
            return false;
        else
            return true;


    }

}
