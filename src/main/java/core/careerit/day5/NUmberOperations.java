package core.careerit.day5;

public class NUmberOperations {
    public static void main(String[] args) {

        int num = 3663;

        int sum = sumOfDigits(num);
        System.out.println("Sum of digits of   "+num+" is : "+sum);

        int rev = reverseTheNumber(num);
        System.out.println("Reverse of number  "+num+" is : "+rev);

        System.out.println("Number "+num+ "  is Palindrome : " +isPalindrome(num));
        System.out.println("Number "+num+ "  is Palindrome : " +isArmStrong(num));
    }

    public static int reverseTheNumber(int num) {
        int rev =0;

        while (num !=0) {
           int r = num % 10;
           rev = rev * 10 + r;
           num = num / 10;
        }
        return rev;
    }

    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num !=0) {
            int r = num % 10;
            sum = sum +r;
            num = num / 10;
        }
        return sum;
    }

    public static boolean isPalindrome(int num)
    {
        return num == reverseTheNumber(num);
    }
    public static boolean isArmStrong(int num){
        int tmp = num;
        int sum = 0;
        while (tmp !=0){
            int r = tmp % 10;
            sum = sum + (r * r * r);
            tmp = tmp / 10;
        }
        return num == sum;
    }
}
