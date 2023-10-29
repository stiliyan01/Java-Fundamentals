import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        boolean equal = true;

        int a [] = {1,2,3};
        int b[] = {1,8,3};

        if(a.length!=b.length){
            equal=false;
        }
        else{
            for (int i = 0; i <a.length ; i++) {
                equal=true;
                if(a[i]!=b[i]){
                    equal =false;
                    break;
                }
            }
        }
        if(equal){
            System.out.println("Arrays are euqal");
        }else{
            System.out.println("Arrays are not equal");
        }
    }
}
