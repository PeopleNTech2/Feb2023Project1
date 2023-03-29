package nestedclass;

public class Outer {//outer class or super class

    int outerVar = 15;

    public Outer(){

    }

    public void outerMethod(){
        System.out.println("this is outer class method");
    }
    //object of inner class
    Inner inner = new Inner();

    public class Inner{//subclass or inner class
        int innerVar = 20;

        public Inner(){

        }

        public void innerMethod(){
            System.out.println("this is inner class method");
        }
    }
}
