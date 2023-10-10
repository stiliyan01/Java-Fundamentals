import java.lang.reflect.Array;
import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = 5;

        int fib1 = 0;
        int fib2 = 1;
        int result = 0;

        for (int i = 2; i <= number; i++) {
            result = fib1 + fib2;
            fib1 = fib2;
            fib2 = result;
        }

        System.out.println("Числото на Фибоначи за " + number + " е: " + result);
    }

}
