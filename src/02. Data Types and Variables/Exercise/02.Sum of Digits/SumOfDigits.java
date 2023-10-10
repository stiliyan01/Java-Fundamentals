import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int number = 0;
        for (int i = 0; i < input.length(); i++) {
            System.out.println(input.charAt(i));
            number += Integer.parseInt(String.valueOf(input.charAt(i)));
        }
        System.out.println(number);
    }
}
