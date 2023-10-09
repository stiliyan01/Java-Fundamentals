import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGames = scanner.nextInt();
        double headsetPrice = scanner.nextDouble();
        double mousePrice = scanner.nextDouble();
        double keyboardPrice = scanner.nextDouble();
        double displayPrice = scanner.nextDouble();

        int headsetCount = 0;
        int mouseCount = 0;
        int keyboardCount = 0;
        int displayCount = 0;


        for (int i = 1; i <= lostGames; i++) {
            if (i % 2 == 0) {
                headsetCount++;
            }
            if (i % 3 == 0) {
                mouseCount++;
            }
            if ((i % 2 == 0) && (i % 3 == 0)) {
                keyboardCount++;
            }
        }
        displayCount = keyboardCount / 2;


        double result = (headsetCount * headsetPrice) +
                (mouseCount * mousePrice) +
                (keyboardCount * keyboardPrice) +
                (displayCount * displayPrice);

        System.out.printf("Rage expenses: %.2f lv.",result);

    }
}
