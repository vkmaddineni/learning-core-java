package core.careerit.day3;

import java.sql.SQLOutput;

public class FibonacciSeriesExample {
    public static void main(String[] args) {

        int n = 10;

        int a = 0; int b =1;
        System.out.println(a+" "+b);

        for (int i=3;i<=n;i++) {
            int sum=+a+b;
            System.out.print(sum+" ");
            a=b;
            b=sum;
        }

    }
}
