package core.careerit.day5;

public class FactorialOfNumber {
    public static void main(String[] args) {
        int num = 6;
        int fact = factorial(num);
        System.out.println("factorial of "+num+" is : "+fact);

        int sum = sumOfFirstOddNumber(num);
        System.out.println("Sum of First "+num+" odd Numbers is : "+sum);

    }

    public static int factorial(int num) {
        int fact =1; int i = 2;
        while (i<=num) {
            fact = fact*i;
            i++;
        }
        return fact;
    }

    public static int sumOfFirstOddNumber(int n){
        int sum =0;
        int i = 1;
        while (i<=n){
            if (i %2 ==0) {
                sum = sum +i;
            }

            i++;
        }
        return sum;
    }
}
