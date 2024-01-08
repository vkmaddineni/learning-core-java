package core.careerit.day4;

public class MethodExamples {
    // factorial of a given number
    // find the sum of series 1 + 1/2!+1/3!+....+1/n!
    public static void main(String[] args) {
        int n = 10;
        int fact1 = factorial(n);
        System.out.println("Factorial of " +n+" is ="+fact1);

        double sum1 =sumFactorial(n);
        System.out.println(" Sum of series 1 + 1/2! + 1/3! +....+ 1/"+n+"/! is = "+sum1);
    }

    public static int factorial(int n) {
        int fact =1;
        for (int i=1;i<=n;i++){
            fact = fact*i;

        }
        return fact;
    }
    public static double sumFactorial(int n){
        double sum =0;
        for (int j=1;j<=n;j++){
            sum = sum + 1/(double) factorial(j);
        }
        return sum;
    }


}
