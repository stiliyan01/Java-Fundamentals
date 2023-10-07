public class MultiplcationTableOnSteroids {

    public static void main(String[] args) {
        int size = 10;

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                int result = i * j;
                System.out.printf("%4d", result);
            }
            System.out.println();
        }
    }


}
