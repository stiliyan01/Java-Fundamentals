import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int number = 1; number <= n; number++) {
            if (isTopNumber(number)) {
                System.out.println(number);
            }
        }
    }

    private static boolean isTopNumber(int number) {
        return hasOddDigit(number) && isSumOfDigitsDivisibleBy8(number);
    }

    private static boolean hasOddDigit(int number) {
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 != 0) {
                return true;
            }
            number /= 10;
        }
        return false;
    }

    private static boolean isSumOfDigitsDivisibleBy8(int number) {
        int sumOfDigits = 0;
        while (number > 0) {
            sumOfDigits += number % 10;
            number /= 10;
        }
        return sumOfDigits % 8 == 0;
    }
}
