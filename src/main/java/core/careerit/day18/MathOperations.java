package core.careerit.day18;

import java.util.List;
import java.util.ArrayList;
public abstract class MathOperations {

    public List<Integer> getPrimes(int ib,int ub) {
        List<Integer> primeList = new ArrayList<>();
        for (int i = ib; i <= ub; i++) {
            if (isPrime(i)) {
                primeList.add(i);
            }
        }
        return primeList;
    }
    public int count(int lb,int ub) {

        return getPrimes(lb,ub).size();
    }
    public abstract boolean isPrime(int num);

}
class MyMathOperations extends MathOperations{
    @Override
    public boolean isPrime(int num){
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

class Manager{
    public static void main(String[] args) {
        MathOperations mo = new MyMathOperations();
        System.out.printf("Is 5 prime? %b\n",mo.isPrime(5));
        System.out.println(mo.getPrimes(10, 50));
        System.out.println(mo.count(10, 50));
    }
}
