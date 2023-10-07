import java.util.Scanner;

public class ForeignAge {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        String country = scan.nextLine();

        String result ;

        switch (country) {
            case "USA", "England":
                result = "English";
                break;
            case "Spain", "Argentina", "Mexico":
                result = "Spanish";
                break;
            default:
                result = "unknown";
                break;
        }
        System.out.println(result);
    }
}
