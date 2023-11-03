import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        int quantity= Integer.parseInt(scanner.nextLine());


        switch (product) {
            case "water" -> sumWater(quantity);
            case "coffee" -> sumCoffee(quantity);
            case "coke" ->sumCoke(quantity);
            case "snacks" -> sumSnacks(quantity);
            default -> System.out.println("invalid");
        }

    }

    private static void sumWater(int quantity) {
        System.out.println(quantity  *1.00);
    }

    private static void sumCoffee(int quantity) {
        System.out.println(quantity * 1.50);
    }

    private static void sumCoke(int quantity) {
        System.out.println( quantity * 1.40);
    }

    private static void sumSnacks(int quantity) {
        System.out.println(quantity * 2.00);
    }


}
