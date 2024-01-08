package core.careerit.day4;

public class GenerateNumbers {
    public static void main(String[] args) {
        int lb =10;
        int ub =50;

        int sum = evenSum(lb,ub);
        System.out.println("Even Numbers Sum of range "+lb+" amd "+ub+ " is = "+sum);
    }
    public static int   evenSum(int lb, int ub){
        int sum = 0;
        for(int i=lb;i<=ub;i++){
            if (isEven(i)){
                sum = sum + i;
            }
        }
        return sum;
    }
    public  static boolean isEven(int num){
        return num%2 == 0;
    }
}
