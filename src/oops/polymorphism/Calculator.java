package oops.polymorphism;

public class Calculator {

    //method overloading: when 2 methods have the same name but different number of parameters
    //we also call it compile time polymorphism
    public void add(int a, int b){
        int total = a + b;
        System.out.println(total);
    }

    public void add(int a, int b, int c){
        int total = a + b + c;
        System.out.println(total);
    }

    public void div(int a, int b){
        int total = a / b;
        System.out.println(total);
    }


}
