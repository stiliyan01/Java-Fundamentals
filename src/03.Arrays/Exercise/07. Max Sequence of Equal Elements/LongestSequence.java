import java.util.Scanner;

public class LongestSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] elements = input.split(" ");
        int[] numbers = new int[elements.length];

        for (int i = 0; i < elements.length; i++) {
            numbers[i] = Integer.parseInt(elements[i]);
        }

        int currentLength = 1;
        int maxLength = 1;
        int sequenceStart = 0;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == numbers[i - 1]) {
                currentLength++;
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    sequenceStart = i - currentLength + 1;
                }
            } else {
                currentLength = 1;
            }
        }

        for (int i = sequenceStart; i < sequenceStart + maxLength; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
