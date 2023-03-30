package collections.set;

import java.util.LinkedHashSet;

public class UseLinkedHashSet {
    public static void main(String[] args) {

        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(5);
        numbers.add(0);
        numbers.add(0);
        numbers.add(0);
        numbers.add(0);
        numbers.add(0);

        System.out.println(numbers);

        LinkedHashSet<String> names = new LinkedHashSet<>();
        names.add("david");
        names.add("casi");
        names.add("fouad");
        names.add("modric");

        System.out.println(names);

    }
}
