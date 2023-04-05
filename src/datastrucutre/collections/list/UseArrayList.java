package datastrucutre.collections.list;

import java.util.ArrayList;

public class UseArrayList {
    public static void main(String[] args) {

        //generic list
        ArrayList list = new ArrayList();
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(0);
        list.add(6);
        list.add("Cucumber");

        System.out.println(list);

        for (int i = 0; i < list.size() ; i++) {
            System.out.println(list.get(i));
        }

        //typed list
        ArrayList<Integer> numbers = new ArrayList<>();
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
