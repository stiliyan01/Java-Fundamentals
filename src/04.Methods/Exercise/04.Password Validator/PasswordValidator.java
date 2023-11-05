import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();
        validator(password);
    }

    private static void validator(String password) {

        boolean errors = false;
        boolean containsSpecialCharacter = false;

        int digitCounter = 0;

        if (password.length() < 6 || password.length() > 10) {
            System.out.println("Password must be between 6 and 10 characters");
            errors=true;
        }

        for (int i = 0; i < password.length(); i++) {


            if (!Character.isLetterOrDigit(password.charAt(i))) {
                containsSpecialCharacter = true;

            }

            if (Character.isDigit(password.charAt(i))) {
                digitCounter++;
            }
        }

        if (containsSpecialCharacter) {
            System.out.println("Password must consist only of letters and digits");
            errors=true;
        }

        if (digitCounter < 2) {
            errors=true;
            System.out.println("Password must have at least 2 digits");
        }

        if (!errors) {
            System.out.println("Password is valid.");
        }
    }
}
