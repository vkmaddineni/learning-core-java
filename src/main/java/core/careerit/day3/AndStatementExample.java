package core.careerit.day3;

public class AndStatementExample {
    public static void main(String[] args) {

        int a =1, b=1, c=1;
        if ( a > 0 && (b = 2) > 1 && (c = 10) > 5){
            System.out.println("Hello");
        }
        System.out.println(a+","+b+","+c);
    }
}
