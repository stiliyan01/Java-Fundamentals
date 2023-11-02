import java.util.Arrays;
import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstInput = scanner.nextLine().split("\\s+");
        String[] secondInput = scanner.nextLine().split("\\s+");



        for (int i = 0; i < firstInput.length; i++) {
            for (int j = 0; j < secondInput.length; j++) {
                if(secondInput[j].equals(firstInput[i])){
                    System.out.print(secondInput[j] + " " );
                }
            }

        }
    }
}
