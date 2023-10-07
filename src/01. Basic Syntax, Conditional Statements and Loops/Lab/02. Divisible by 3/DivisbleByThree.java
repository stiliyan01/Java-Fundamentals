import java.util.Scanner;

public class DivisbleByThree {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int start = scan.nextInt();
        int end = scan.nextInt();

        for (int i = start; i <= end; i += 3) {
            if (i != 0) {
                System.out.println(i);
            }
        }
    }
}
