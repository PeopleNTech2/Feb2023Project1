package collections.list;

import java.util.ArrayList;
import java.util.LinkedList;

public class UseLinkedList {
    public static void main(String[] args) {

        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(5);
        numbers.add(0);
        numbers.add(6);

        System.out.println(numbers);
        numbers.remove(1);
        System.out.println(numbers);
        numbers.add(2, 9);
        System.out.println(numbers);
        numbers.add(45);
        System.out.println(numbers);
        numbers.set(5, 852);
        System.out.println(numbers);
        numbers.add(6, 9872);
        System.out.println(numbers);

    }
}
