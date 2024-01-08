package core.careerit.day4;

public class BreakAndContinue {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

        //skip the element if it is divisible by 3 and print elements until  number  is divisible by 3 and 6 and 9
        for(int i=0; i<arr.length;i++) {
            int ele = arr[i];

            if (ele % 6 == 0) {
                break;
            }

            if ((ele % 3 == 0) ) {
                continue;
            }

            System.out.println(ele);


        }
    }
}
