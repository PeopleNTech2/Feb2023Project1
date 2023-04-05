package datastrucutre.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UseIterator {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(5);
        numbers.add(0);
        numbers.add(6);

//        System.out.println(numbers);
//
//        System.out.println(numbers.get(1));
//
//        for (int i = 0; i < numbers.size(); i++) {
//            System.out.println(numbers.get(i));
//        }
//
//        for (int number: numbers) {
//            System.out.println(number);
//        }

        Iterator<Integer> it = numbers.iterator();
//        System.out.println(it.hasNext());
//        System.out.println(it.next());
//        System.out.println(it.hasNext());
//        System.out.println(it.next());
//        System.out.println(it.hasNext());
//        System.out.println(it.next());
//        System.out.println(it.hasNext());
//        System.out.println(it.next());
//        System.out.println(it.hasNext());
//        System.out.println(it.next());
//        System.out.println(it.hasNext());
//        System.out.println(it.next());

        while (it.hasNext()){
            System.out.println(it.next());
        }

        List<Object> names = new ArrayList<>();//generic list
        names.add("Kamel");
        names.add("Boris");
        names.add(123);

        for (Object name :names) {
            System.out.println(name);
        }

//        Iterator it1 = names.iterator();
//        while (it1.hasNext()){
//            System.out.println(it1.next());
//        }

    }
}
