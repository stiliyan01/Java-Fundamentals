import java.util.Collections;
import java.util.HashMap;

import java.util.Map;
import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Double> map = new HashMap<>();


        int iterations = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i < iterations; i++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());
            double volume = 3.14 * Math.pow(radius, 2) * height;

            map.put(model, volume);
        }

        double maxValueInMap = (Collections.max(map.values()));

        for (Map.Entry<String, Double> entry : map.entrySet()) {
            if (entry.getValue() == maxValueInMap) {
                System.out.println(entry.getKey() + " " + maxValueInMap);
                break;
            }
        }
    }
}
