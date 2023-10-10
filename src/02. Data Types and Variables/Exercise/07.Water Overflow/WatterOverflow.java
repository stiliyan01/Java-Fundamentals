import java.util.Scanner;

public class WatterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int iterations = Integer.parseInt(scanner.nextLine());
        int waterTank = 255;
        int result = 0;
        for (int i = 0; i < iterations; i++) {
            int litters = Integer.parseInt(scanner.nextLine());
            if (waterTank > result + litters || waterTank == result + litters) {
                result += litters;
            } else {
                System.out.println("Insufficient capacity");
                break;
            }
            System.out.println(result + "result");
        }
        System.out.println(result);
    }
}
