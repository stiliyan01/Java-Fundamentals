import java.util.Scanner;

public class ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String arr[] = input.split("");

        for (int i = 0; i < arr.length / 2; i++) {
            String current = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = current;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
