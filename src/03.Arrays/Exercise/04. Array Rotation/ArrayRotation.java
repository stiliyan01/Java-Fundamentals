import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String arr[] = scanner.nextLine().split("\\s++");
        int rotation = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= rotation; i++) {
            String firstElement = arr[0];
            for (int j = 1; j < arr.length; j++) {
                arr[j - 1] = arr[j];
            }
            arr[arr.length - 1] = firstElement;
        }
        for (String s : arr) {
            System.out.print(s + " ");
        }
    }


}
