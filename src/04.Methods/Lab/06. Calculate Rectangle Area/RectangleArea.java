import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double width = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());

        System.out.println(rectangleArea(width, height));
    }

    private static double  rectangleArea(double width, double height) {
        return (width * height);
    }

}
