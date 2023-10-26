import java.util.Scanner;

public class NumbersInReverseOrder {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();
        String[] numbersAsStrings = value.split("[,\\s]+");

        int[] numbers = new int[numbersAsStrings.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=Integer.parseInt(numbersAsStrings[i]);
        }
        for (int i = 0; i < numbers.length / 2; i++) {
            int otherIndex = numbers.length - 1 - i;
            int temp = numbers[i];
            numbers[i] = numbers[otherIndex];
            numbers[otherIndex] = temp;
        }

        for (int number : numbers) {
            System.out.println(number);
        }


    }
}
