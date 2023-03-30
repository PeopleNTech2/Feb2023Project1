package wrapperclasses;

import static java.time.LocalTime.*;

public class UseWrapperClasses {
    public static void main(String[] args) {

        //primitive variables: byte, short, int, long, float, double, char, boolean

        //instance variables: String, Byte, Short, Integer, Long, Float, Double, Character, Boolean ...
        Byte b = 124;
        Short s = 15425;
        Integer i = 1541643;
        Long l = 1516465181L;
        Float f = 125.52652525F;
        Double d = 1254.358256256562;
        Character c = '5';
        Boolean bool = true;

        System.out.println();

        //LocalTime localTime = LocalTime.now();
        System.out.println(now());


    }
}
