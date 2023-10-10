import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people=Integer.parseInt(scanner.nextLine());
        int capacity=Integer.parseInt(scanner.next());

        int result = people/capacity;
        int coursesMores=people%capacity;
        if(coursesMores>0){
            result++;
        }
        System.out.println(result + " courses needed" );


    }
}
