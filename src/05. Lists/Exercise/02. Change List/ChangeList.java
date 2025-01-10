import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.equals("end")) {
                break;
            }

            String[] input = line.split(" ");

            if (input[0].equals("Delete")) {
                for (int i = 1; i < input.length; i++) {
                    int num = Integer.parseInt(input[i]);
                    list.removeIf(x -> x == num);
                }
            } else if (input[0].equals("Insert")) {
                int number = Integer.parseInt(input[1]);
                int index = Integer.parseInt(input[2]);
                list.add(index, number);
            } else {
                for (int i = 0; i < input.length; i++) {
                    list.add(Integer.parseInt(input[i]));
                }
            }
        }

        Printer.printList(list);

    }
}
