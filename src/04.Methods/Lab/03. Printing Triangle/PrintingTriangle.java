import java.util.Scanner;

public class PrintingTriangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int end = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <=end; i++) {
            printLine(1,i);
        }

        for (int i =end-1; i >=1; i--) {

            printLine(1,i);
        }

    }
    private static void printLine(int start,int end){
        for (int i = start; i <=end ; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
