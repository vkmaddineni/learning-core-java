package core.careerit.day8;

import java.util.Arrays;

public class searchElement {

    public static void main(String[] args) {
        System.out.println(isAnagram("CAT","ACT"));
       System.out.println(isSubSet(new int[]{1,2,3},new int[]{1,4}));
        System.out.println("The biggest num is  : "+biggest(new int[]{23,12,44,67,45}));
        System.out.println("The smallest num is : "+smallest(new int[]{23,12,44,67,45}));

    }

    private static int getIndex(int[] arr,int key){
        for(int i=0;i<arr.length-1;i++){
            if (arr[i] == key){
                return i;
            }
        }
        return -1;
    }

    private static boolean isSubSet(int[] masterArr,int[] subArr){
      if (masterArr.length < subArr.length) {
          return false;
      }
      for (int ele:subArr){
          if(getIndex(masterArr,ele) == -1){
              return false;
          }
      }

        return true;
    }

    private static boolean isAnagram(String word1, String word2){
         if (word1.length() != word2.length()) {
             return false;
         }
         char[] arr1 = word1.toCharArray();
         char[] arr2 = word2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1,arr2);
    }

    private static int biggest(int[] arr){
        Arrays.sort(arr);
        int max = arr[arr.length-1];
        return max;
    }
    private static int smallest(int[] arr){
        Arrays.sort(arr);
        int small = arr[0];
        return small;
    }
    private static Employee maxPaidEmployee(Employee[] empArr){
        double maxSal = getMaxSalary(empArr);
        for(Employee emp:empArr){
            if(emp.getSalary() == maxSal){
                return emp;
            }
        }
        throw new IllegalArgumentException(" No Max Paid Employee found");
    }
    private static double getMaxSalary(Employee[] empArr){
        double max = empArr[0].getSalary();
        for(Employee ele:empArr){
            if (max < ele.getSalary()){
                max = ele.getSalary();
            }
        }
        return max;
    }
}
