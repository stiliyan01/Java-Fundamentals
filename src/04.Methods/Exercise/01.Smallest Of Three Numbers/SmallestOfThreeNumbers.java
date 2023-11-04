import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());
        printSmallest(firstNumber,secondNumber,thirdNumber);

    }
    public static void printSmallest(int a, int b, int c) {
        int smallest = Math.min(Math.min(a, b), c);
        System.out.println("The smallest number is: " + smallest);
    }
}
