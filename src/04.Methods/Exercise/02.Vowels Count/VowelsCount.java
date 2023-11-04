import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        vowelsCounter(input);
    }

    private static void vowelsCounter(String str) {
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case 'a' -> result++;
                case 'e' -> result++;
                case 'i' -> result++;
                case 'o' -> result++;
                case 'u' -> result++;

            }
        }
        System.out.println(result);
    }
}
