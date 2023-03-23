package oops.polymorphism;

public class ModernCalculator extends Calculator{

    //method overriding is when 2 method have the same name and the same number of parameters but different body
    //also called runtime polymorphism
    //annotation or decoration
    @Override
    public void add(int a, int b){
        int total = a + b + 10;
        System.out.println(total);
    }
}
