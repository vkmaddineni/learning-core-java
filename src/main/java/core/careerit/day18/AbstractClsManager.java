package core.careerit.day18;

abstract class T1 {
    T1() {
        System.out.println("T1 constructor");
    }
    abstract void display();
}

abstract class T2 extends T1 {
    T2() {
        super();
        System.out.println("T2 constructor");
    }
}
class T3 extends T2 {
    T3() {
        super();
        System.out.println("T3 constructor");
    }

    @Override
    void display() {
        System.out.println("T3 display");
    }
}
public class AbstractClsManager {
    public static void main(String[] args) {
         T1 t1 = new T3(); // Compilation error
        t1.display();
            }
}
