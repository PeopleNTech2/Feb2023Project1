package collections.set;

import java.util.ArrayList;
import java.util.HashSet;

public class UseHashSet {
    public static void main(String[] args) {

        //hash get a random order
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(5);
        numbers.add(0);
        numbers.add(0);
        numbers.add(0);
        numbers.add(0);
        numbers.add(0);

        System.out.println(numbers);

        HashSet<String> names = new HashSet<>();
        names.add("david");
        names.add("casi");
        names.add("fouad");
        names.add("modric");
        names.add("modric");
        names.add("modric");

        System.out.println(names);

    }
}
