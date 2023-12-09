package core.careerit.day2;

import java.util.Scanner;

public class BillDiscountCalculator {

    public static void main(String[] args){
        // if Bill Amount is greater than 5000 then apply 20% discount
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Bill Amount : " );
        float billAmount = sc.nextFloat();
        float discount = 0;
        if (billAmount > 5000) {
            discount = billAmount * 0.2f;
        }
        float netAmount = billAmount - discount;
        System.out.println("Bill Amount     is    : "+billAmount );
        System.out.println("Discount        is    : "+discount);
        System.out.println("Net Amount Paid is    : "+netAmount );

    }
}
