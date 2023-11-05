import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        char firstInput= scanner.nextLine().charAt(0);
        char secondInput= scanner.nextLine().charAt(0);

        changer(firstInput,secondInput);
    }

    private static void changer(char firstInput,char secondInput) {
        for (int i = (int)firstInput+1; i <(int)secondInput ; i++) {
            System.out.print(((char)i)+" ");
        }
    }
}
