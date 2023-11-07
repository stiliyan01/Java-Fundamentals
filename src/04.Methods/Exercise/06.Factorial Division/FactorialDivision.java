import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstNumber = Double.parseDouble(scanner.nextLine());
        double secondNumber = Double.parseDouble(scanner.nextLine());

        System.out.println(divide(factorial(firstNumber), factorial(secondNumber)));

    }



    private static double factorial(double number){
        double result = 1;

        for (double i = number; i >=1; i--) {
            result*=i;
        }
        return result;
    }

    private static double divide(double firstNumber,double secondNumber){
        return firstNumber/secondNumber;
    }
}
