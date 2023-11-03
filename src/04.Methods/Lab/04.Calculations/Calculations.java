import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String choice = scanner.nextLine();
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        switch (choice) {
            case "add" -> add(firstNumber, secondNumber);
            case "subtract" -> subtract(firstNumber, secondNumber);
            case "multiply" -> multiply(firstNumber, secondNumber);
            case "divide" -> divide(firstNumber, secondNumber);
            default -> System.out.println("invalid");
        }
    }

    private static void divide(int firstNumber, int secondNumber) {
        System.out.println(firstNumber / secondNumber);
    }

    private static void multiply(int firstNumber, int secondNumber) {
        System.out.println(firstNumber*secondNumber);
    }

    private static void subtract(int firstNumber, int secondNumber) {
        System.out.println(firstNumber-secondNumber);
    }


    private static void add(int firstNumber, int secondNumber) {
        System.out.println(firstNumber+secondNumber);
    }

}
