package core.careerit.day2;

import java.util.Scanner;

public class BiggestNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First  Number :" );
        int num1 = sc.nextInt();
        System.out.println("Enter the Second Number :" );
        int num2 = sc.nextInt();
        System.out.println("Enter the Third Number :" );
        int num3 = sc.nextInt();

        int big;
        if (num1 > num2 && num1 > num3) {
            big = num1;
        } else if (num2 > num3){
            big = num2;
        } else {
            big = num3;
        }

        System.out.println("Biggest Number is :"+big);


    }
}
