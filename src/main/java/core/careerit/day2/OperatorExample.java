package core.careerit.day2;

import java.util.Scanner;

public class OperatorExample {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value of First variable : ");
        int a = sc.nextInt();
        System.out.println("Enter Value of Second variable : ");
        int b = sc.nextInt();

        System.out.println("Sum of      "+a+" and        "+b+"   is : "+(a+b));
        System.out.println("Subtract    "+a+" from       "+b+"   is : "+(a-b));
        System.out.println("Multiply    "+a+" with       "+b+"   is : "+(a*b));
        System.out.println("Divide      "+a+" by         "+b+"   is : "+(a/b));
        System.out.println("Reminder of "+a+" divided by "+b+"   is : "+(a%b));

        System.out.println("Is "+a+" greater than "+b+" "+(a>b) );
        System.out.println("Is "+a+" less    than "+b+" "+(a<b) );
        System.out.println("Is "+a+" greater than or equal to "+b+" "+(a>=b) );
        System.out.println("Is "+a+" less    than or equal to "+b+" "+(a<=b) );
    }
}
