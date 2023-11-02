import java.util.Scanner;

public class ZigZacArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());

        String firstArray[] = new String[length];
        String secondArray[] = new String[length];

        for (int i = 0; i < length; i++) {
            String input[] = scanner.nextLine().split("\\s++");
            if (i % 2 != 0) {
                firstArray[i] = input[1];
                secondArray[i] = input[0];
            } else if (i % 2 == 0) {
                firstArray[i] = input[0];
                secondArray[i] = input[1];
            }
        }

        for (String firstElement : firstArray) {
            System.out.print(firstElement + " ");
        }
        System.out.println();
        for (String secondElement : secondArray) {
            System.out.print(secondElement + " ");
        }

    }
}
