public class SignOfIntegerNumbers {
    public static void main(String[] args) {
        signInteger(5);
        signInteger(-2);
        signInteger(0);
    }

    public static void signInteger(int number) {
        if (number > 0) {
            System.out.println("The number " + number + " is positive.");
        } else if (number == 0) {
            System.out.println("The number " + number + " is zero.");
        } else {
            System.out.println("The number " + number + " is negative.");
        }
    }
}
