package core.careerit.day19;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExampleWithArrays {
    public static void main(String[] args) {

        int [] arr1 = new int[]{1, 2, 3, 4, 5};
        int [] arr2 = new int[]{6, 7, 8, 9, 10};
        List<Integer> list = new ArrayList<>();

        for(int ele: arr1){
            list.add(ele);
        }
        for (int ele: arr2){
            list.add(ele);
        }
        System.out.println(list);
    }
}
