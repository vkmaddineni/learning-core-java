package core.careerit.day19;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExampleBasics {
    public static void main(String[] args) {
        // Create a list of integers
        List<String> list = new ArrayList<>();
        list.add("Krishna");
        list.add("Ram");
        list.add("Shyam");
        list.add("Gopal");
        list.add("Krishna");

        System.out.println("List: " + list);
        System.out.println(list.get(3));
        System.out.println(list.isEmpty());
        System.out.println(list.size());

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            if(iterator.next().equals("Krishna") ) {
                iterator.remove();
            }
        }


        for (String name : list) {
            System.out.println(name);
        }
        System.out.println("List: " + list);
        list.forEach(name -> System.out.println(name));

        list.clear();
        System.out.println("List: " + list);

        //remove duplicates from list
        List<String> list1 = new ArrayList<>();
        list1.add("Krishna");
        list1.add("Ram");
        list1.add("Shyam");
        list1.add("Gopal");
        list1.add("Krishna");
        System.out.println("List1: " + list1);
        Iterator ite = list1.iterator();
        while (ite.hasNext()) {
            String name = (String) ite.next();
            if (list1.indexOf(name) != list1.lastIndexOf(name)) {
                ite.remove();
            }
        }
        System.out.println("List1: " + list1);

       }
}
