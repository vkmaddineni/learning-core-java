package core.careerit.day18;

import java.sql.SQLOutput;

interface operation {
  int perform(int a, int b);
}
class MyMath{
    public int calculate(int a, int b, operation op){
        return op.perform(a, b);
    }
}
class Add implements operation{
    @Override
    public int perform(int a, int b) {
        return a + b;
    }
}
class Sub implements operation{
    @Override
    public int perform(int a, int b) {
        return a - b;
    }
}
class Mul implements operation{
    @Override
    public int perform(int a, int b) {
        return a * b;
    }
}
class Div implements operation{
    @Override
    public int perform(int a, int b) {
        return a / b;
    }
}
class Mod implements operation{
    @Override
    public int perform(int a, int b) {
        return a % b;
    }
}
class Power implements operation{
    @Override
    public int perform(int a, int b) {
        return (int) Math.pow(a, b);
    }
}
class SquareRoot implements operation{
    @Override
    public int perform(int a, int b) {
        return (int) Math.sqrt(a);
    }
}
class CubeRoot implements operation{
    @Override
    public int perform(int a, int b) {
        return (int) Math.cbrt(a);
    }
}
class isPrime implements operation{
    @Override
    public int perform(int a, int b) {
        for(int i = 2; i < a; i++){
            if(a % i == 0){
                return 0;
            }
        }
        return 1;
    }
}

public class IManager {
    public static void main(String[] args) {
         MyMath math = new MyMath();
         int sum = math.calculate(10, 5, new Add());
         int sub = math.calculate(10, 5, new Sub());
         int mul = math.calculate(10, 5, new Mul());
         double div = math.calculate(10, 5, new Div());
         int mod = math.calculate(10, 5, new Mod());
         int power = math.calculate(10, 5, new Power());
         int squareRoot = math.calculate(10, 5, new SquareRoot());
         int cubeRoot = math.calculate(10, 5, new CubeRoot());
         int prime = math.calculate(10, 5, new isPrime());

        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + sub);
        System.out.println("Multiplication: " + mul);
        System.out.println("Division: " + div);
        System.out.println("Mod :"+mod);
        System.out.println("Power :"+power);
        System.out.println("SquareRoot :"+squareRoot);
        System.out.println("CubeRoot :"+cubeRoot);

        if(prime == 1) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
}
