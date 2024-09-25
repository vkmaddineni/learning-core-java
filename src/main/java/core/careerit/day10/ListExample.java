package core.careerit.day10;
import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        System.out.println("The list Size : "+list.size());
        list.remove(2);
        System.out.println("The list Size : "+list.size());
        list.set(1,20);
        System.out.println(list);

        List<String> names = new ArrayList<>();
        names.add("Krish");
        names.add("Vijay");
        names.add("Venu");
        names.add("Manoj");
        names.add("Raj");
        names.add("Mary");
        System.out.println(names);

        for(int i=0;i<names.size();i++){
            System.out.println(names.get(i));
        }
        for (String name: names) {
            System.out.println(name);
        }

        System.out.println(names.isEmpty());

        list.add(10);
        list.add(20);
        list.add(30);
        list.remove(8);
        System.out.println(list);

    }
}
