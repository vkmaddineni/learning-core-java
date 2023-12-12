package core.careerit.day1;

import java.util.Scanner;

public class AverageOfThreeNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter The num1 : ");
        float num1 = sc.nextFloat();

        System.out.println(" Enter The num2 : ");
        float num2 = sc.nextFloat();

        System.out.println(" Enter The num3 : ");
        float num3 = sc.nextFloat();

        float sum = num1 + num2 + num3;
        float avg = sum/3;

        System.out.println("The Sum     of  "+num1+","+num2+" and "+num3+" is : " + Math.round(sum));
        System.out.println("The Average of  "+num1+","+num2+" and "+num3+" is : " + Math.round(avg));
    }
}
