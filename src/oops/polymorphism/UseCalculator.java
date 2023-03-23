package oops.polymorphism;

public class UseCalculator {
    public static void main(String[] args) {

        Calculator cal = new Calculator();

        cal.add(5 , 7, 8);

        //example of runtime error
        //cal.div(10, 0);

        ModernCalculator mcal = new ModernCalculator();

        mcal.add(5, 5);

    }
}
