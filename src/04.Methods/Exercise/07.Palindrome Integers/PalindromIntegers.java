import java.util.Scanner;

public class PalindromIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("END")) {
                break;
            }

            int number = Integer.parseInt(input);

            if (isPalindrome(number)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }

    public static boolean isPalindrome(int number) {
        String numberStr = String.valueOf(number);
        int length = numberStr.length();

        for (int i = 0; i < length / 2; i++) {
            if (numberStr.charAt(i) != numberStr.charAt(length - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}
