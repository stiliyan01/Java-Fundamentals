import java.util.Scanner;

public class SumEvenAndOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();
        String[] numbersAsStrings = value.split("[,\\s]+");
        int [] numbers = new int[numbersAsStrings.length];

        int sumOdds=0;
        int sumEven=0;


        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=Integer.parseInt(numbersAsStrings[i]);
            if(numbers[i]%2==0){
                sumEven+=numbers[i];
            }else{
                sumOdds+=numbers[i];
            }
        }
        System.out.println("The difference is: "+ (sumEven-sumOdds));
    }
}
