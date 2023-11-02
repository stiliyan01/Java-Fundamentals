import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String arr[] = scanner.nextLine().split("\\s++");
        boolean state = false;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            int sumLeft = 0;
            int sumRight = 0;
            for (int j = 0; j < i; j++) {
                sumLeft += Integer.parseInt(arr[j]);
            }
            for (int j = arr.length - 1; j > i; j--) {
                sumRight += Integer.parseInt(arr[j]);
            }
            if (sumLeft == sumRight) {
                state = true;
                index = i;
            }
        }
        if (arr.length == 1 || arr.length == 0) {
            System.out.println(0);
        } else if (state) {
            System.out.println(index);
        } else {
            System.out.println("no");
        }
    }
}

