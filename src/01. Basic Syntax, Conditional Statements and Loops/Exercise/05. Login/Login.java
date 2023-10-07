import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        String username= scanner.nextLine();
        String input = scanner.nextLine();
        StringBuilder password = new StringBuilder();

        password.append(username);
        password.reverse();
        System.out.println(password + " tova e pasasword");

        while(!input.equals(password)){
            System.out.println("Incorect password");
            input=scanner.nextLine();
            if(input.equals(password.toString())){
                System.out.println("User logged in");
                return;
            }
        }
    }
}
