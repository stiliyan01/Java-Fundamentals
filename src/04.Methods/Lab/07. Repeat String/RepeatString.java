import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int repeats = Integer.parseInt(scanner.nextLine());
        String string = scanner.nextLine();

        repeatString(repeats,string);

    }
    private static void repeatString(int repeats,String str){
        System.out.println(String.valueOf(str).repeat(Math.max(0, repeats)));
    }
}
