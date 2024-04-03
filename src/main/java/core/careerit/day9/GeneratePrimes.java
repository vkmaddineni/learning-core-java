package core.careerit.day9;

import java.util.Arrays;

public class GeneratePrimes {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1,3,5,7,9};
        int[] arr2 = new int[]{2,4,6,8,10};

        int[] arr3 = new int[arr1.length+arr2.length];
        int c =0;
        for (int ele : arr1) {
            arr3[c++] = ele;
        }
        for (int ele : arr2) {
            arr3[c++] = ele;
        }
        Arrays.sort(arr3);
        int[] tmp = new int[arr3.length-1];
        System.arraycopy(arr3,0,tmp,0,5);
        System.arraycopy(arr3,6,tmp,5,arr3.length-6);
        System.out.println(Arrays.toString(tmp));

    }
}
