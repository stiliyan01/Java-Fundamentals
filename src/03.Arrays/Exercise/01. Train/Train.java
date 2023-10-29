import java.util.Scanner;

public class Train {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int wagons[] = new int[Integer.parseInt(scanner.nextLine())];
        int sum = 0;
        for (int i = 0; i < wagons.length; i++) {
            wagons[i] = Integer.parseInt(scanner.nextLine());
            sum += wagons[i];
        }
        for (int ppl : wagons) {
            System.out.print(ppl + " ");
        }
        System.out.println();
        System.out.println(sum);

    }
}
