package core.careerit.day10;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<Integer> cs = List.of(10, 11, 12, 13, 14);
        List<Integer> is = List.of(15, 16, 10, 11, 17);
        List<Integer> ec = List.of(18,19,10,20,11);

        List<List<Integer>> alllist = List.of(cs,is,ec);
        System.out.println(alllist);
        List<Integer> uniquelist = new ArrayList<>();

        for (List<Integer> ele: alllist) {
            if (!uniquelist.contains(ele)) {
                uniquelist.add(alllist.indexOf(ele));
            }
        }
        System.out.println(uniquelist);

        List<Integer> empWorkingForAllDept = new ArrayList<>();
        for (Integer ele:uniquelist){
            if(cs.contains(ele) && is.contains(ele) && ec.contains(ele)){
                empWorkingForAllDept.add(ele);
            }
        }
        System.out.println(empWorkingForAllDept);
    }
    }

