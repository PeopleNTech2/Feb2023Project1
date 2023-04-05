package datastrucutre.collections.list;

import java.util.Stack;

public class UseStack {
    public static void main(String[] args) {

        Stack<Integer> numbers = new Stack<>();
        numbers.push(2);
        numbers.push(3);
        numbers.push(5);
        numbers.push(0);
        numbers.push(6);

        numbers.peek();
    }
}
