public class TopIntegers {
    public static void main(String[] args) {
        String[] input = {"1", "4", "3", "2"};


        for (int i = 0; i < input.length; i++) {
            boolean bool = false;
            int currentValue = Integer.parseInt(input[i]);
            for (int j = i; j < input.length; j++) {
                if (currentValue >= Integer.parseInt(input[j])) {
                    System.out.print(input[j] + " , ");
                }
            }
            break;
//            System.out.println("--");
        }
    }
}
