public class ArrayManipulator {
    public static void main(String[] args) {

        String input = "exchange 2";
        String [] inputArr= input.split("\\s++");
        for (int i = 0; i < inputArr.length; i++) {
//            System.out.println(Character.isDigit(Integer.parseInt(inputArr[i])));
        }
        int value = Integer.parseInt(input.replaceAll("[^0-9]", ""));
        System.out.println(value);

        switch (input){

        }

    }
    private static int[] ko(int[] arr){
        arr[0]=10;
        return arr;
    }
}
