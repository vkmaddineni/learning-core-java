package core.careerit.day7;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class ArrayExample {
    public static void main(String[] args) {
        int[] arr = new int[10];

        for(int i=0;i< arr.length;i++){
           arr[i] = ThreadLocalRandom.current().nextInt(10,100);
        }
        int sum = 0;
        for(int i=0; i< arr.length;i++ ){
            sum = sum + arr[i];
           }
        System.out.println(Arrays.toString(arr));
        System.out.println(showDetails(arr));
        System.out.println("The Sum is :"+sum);
        double avg = sum / (double)arr.length;
        System.out.println("The Average is :"+avg);
    }
    private static String showDetails(int[] arr){
        String str = "[]";
        if (arr.length != 0){
            str = "[";
            for(int i=0;i <arr.length;i++){
                str +=arr[i]+",";
            }
            str = str.substring(0,str.length() -1) ;
            str+="]";
        }
        return str;
    }
}
