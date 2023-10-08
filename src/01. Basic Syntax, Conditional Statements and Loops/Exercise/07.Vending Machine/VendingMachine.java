import java.text.DecimalFormat;
import java.util.*;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat moneyFormat = new DecimalFormat("0.00");
        Set<String> validCoins = new HashSet<>(Arrays.asList("0.1", "0.2", "0.5", "1", "2"));
        Map<String, Double> products = new HashMap<>();
        products.put("nuts", 2.0);
        products.put("water", 0.7);
        products.put("crisps", 1.5);
        products.put("soda", 0.8);
        products.put("coke", 1.0);

        double money = acceptCoins(scanner, validCoins);

        String input = scanner.nextLine().toLowerCase();

        while (!input.equals("end")) {
            if (products.containsKey(input)) {
                money = purchaseProduct(input, money, products);
            } else {
                System.out.println("Invalid product");
            }
            input = scanner.nextLine().toLowerCase();
        }

        System.out.println("Change: " + moneyFormat.format(money));
    }

    public static double acceptCoins(Scanner scanner, Set<String> validCoins) {
        double money = 0;
        String input;

        while (true) {
            input = scanner.nextLine().toLowerCase();
            if (input.equals("start")) {
                break;
            }
            if (validCoins.contains(input)) {
                money += Double.parseDouble(input);
            } else {
                System.out.println("Cannot accept: " + input);
            }
        }

        return money;
    }

    public static double purchaseProduct(String product, double money, Map<String, Double> products) {
        double productPrice = products.get(product);
        if (money >= productPrice) {
            money -= productPrice;
            System.out.println("Purchased " + product);
        } else {
            System.out.println("Not enough money");
        }
        return money;
    }
}
