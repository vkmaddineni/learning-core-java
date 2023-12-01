package core.careerit.day1;

import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the Loan Amount :  ");
        float p = sc.nextFloat();
        System.out.println(" Enter the Rate of Interest % :  ");
        float r = sc.nextFloat();
        System.out.println(" Enter the Loan Tenure        :  ");
        float t = sc.nextInt();

        float si = (p * t * r)/100;
        float totalAmount = p + si;
        System.out.println(" Loan Amount       is          :  " +Math.round(p));
        System.out.println(" Rate of Interest  is          :  " +Math.round(r)+" %");
        System.out.println(" Loan Tenure       is          :  " +Math.round(t)+ " Years");
        System.out.println(" Simple Interest   is          :  " +Math.round(si));
        System.out.println(" Total Amount      is          :  " +Math.round(totalAmount));


    }
}
