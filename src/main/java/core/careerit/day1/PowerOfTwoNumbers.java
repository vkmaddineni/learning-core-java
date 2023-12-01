package core.careerit.day1;

import java.util.Scanner;

public class PowerOfTwoNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for m : ");
        int m = sc.nextInt();
        System.out.println("Enter the value for n : ");
        int n = sc.nextInt();

        double result = Math.pow(m,n);

        System.out.println( m+" to the power of "+n+" is : "+result);

    }
}
