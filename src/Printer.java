import java.util.List;

public class Printer {

    public static void printList(List<Integer> list){
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }

    public static <t> void printArray(t[] array){
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if(i != array.length - 1 ) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
}
