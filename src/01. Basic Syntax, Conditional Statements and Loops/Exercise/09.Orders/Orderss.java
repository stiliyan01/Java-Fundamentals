import java.util.Scanner;


public class Orderss {
    public static void main(String[] args) {

        // ((daysInMonth * capsulesCount)*pricePerCapsule

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double result = 0;
        for (int i = 0; i < n; i++) {
            double pricePerCapsule = Double.parseDouble(scanner.nextLine());

            int daysInMonth = Integer.parseInt(scanner.nextLine());
            int capsulesCount = Integer.parseInt(scanner.nextLine());
            System.out.println("tuk");
            result = ((daysInMonth * capsulesCount) * pricePerCapsule);

        }

        System.out.println("Total: "+ result);

    }
}
