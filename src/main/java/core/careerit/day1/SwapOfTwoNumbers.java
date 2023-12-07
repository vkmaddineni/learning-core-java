package core.careerit.day1;

public class SwapOfTwoNumbers {
    public static void main(String[] args){
        int num1 = 10;
        int num2 = 20;

        System.out.println("Two Numbers Before Swap are :"+num1+" and "+num2);
        /*int num3 = num1;
        num1 = num2;
        num2 = num3;*/
        num1 = num1+num2;
        num2 = num1-num2;
        num1 = num1-num2;
        System.out.println("Two Numbers After Swap are :"+num1+" and "+num2);



    }
}
