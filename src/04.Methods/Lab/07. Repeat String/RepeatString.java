import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int repeats = Integer.parseInt(scanner.nextLine());
        String string = scanner.nextLine();

        System.out.println(repeatString(repeats, string));

    }
    private static String repeatString(int repeats,String str){
       return (String.valueOf(str).repeat(Math.max(0, repeats)));
    }
}
