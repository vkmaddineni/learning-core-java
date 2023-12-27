package core.careerit.day3;

public class BreakExample {
    public static void main(String[] args) {

        for (int i=1;i<=10;i++){
            if (i%3 == 0 && i > 3) {
                System.out.println("Value of i at break: "+i);
                break;
              }

            System.out.println(i);
        }
    }
}
