import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String [] input= scanner.nextLine().split("\\s++");
        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < input.length; i++) {
            for (int j = i; j < input.length; j++) {
                if(Integer.parseInt(input[i])+Integer.parseInt(input[j])==number){
                    System.out.print(input[i] + " " + input[j]);
                    System.out.println();
                }
            }

        }
    }
}
