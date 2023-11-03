import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double width = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());

        rectangleArea(width,height);
    }

    private static void rectangleArea(double width, double height) {
        System.out.println(width * height);
    }

}
