package core.careerit.day1;

import java.util.Scanner;

public class EmiCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Loan Amount :");
        double p = sc.nextDouble();
        System.out.println("Enter the Rate of Interest % :");
        double r = sc.nextDouble();
        System.out.println("Enter the Loan Tenure :");
        int t = sc.nextInt();
        double ri = r/12/100;

        double emi = p * ri * Math.pow(1+ri,t)/(Math.pow(1+ri,t)-1);
        double totalAmount = emi*t;
        double totalInterest = totalAmount - p;

        System.out.println(" Loan Amount                   is : "+Math.round(p));
        System.out.println(" Rate of Interest              is : "+Math.round(r)+"%");
        System.out.println(" Loan Tenure                   is : "+t);
        System.out.println(" Estimated Monthly Installment is : "+Math.round(emi));
        System.out.println(" Total Interest                is : "+Math.round(totalInterest));
        System.out.println(" Total Amount                  is :"+Math.round(totalAmount));

    }
}
