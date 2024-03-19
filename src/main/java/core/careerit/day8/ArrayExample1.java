package core.careerit.day8;

import java.util.Arrays;

public class ArrayExample1 {

    public static void main(String[] args) {

        String data = "10,20,30,40,50,60,100,90,70";
        String[] arr = data.split(",");
        int[] numArr = new int[arr.length];

        for (String ele:arr){
            System.out.println(ele);
        }
        for (int i=0;i<arr.length;i++){
            numArr[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(numArr);
        System.out.println(Arrays.toString(numArr));
    }
}
