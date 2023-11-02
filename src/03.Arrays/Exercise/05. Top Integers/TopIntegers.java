import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s++");

        for (int i = 0; i < input.length; i++) {
            int currentNumber = Integer.parseInt(input[i]);
            boolean isTop = true;

            for (int j = i + 1; j < input.length; j++) {
                if (currentNumber <= Integer.parseInt(input[j])) {
                    isTop = false;
                    break;
                }
            }

            if (isTop) {
                System.out.print(currentNumber + " ");
            }
        }

        System.out.println();

    }
}
