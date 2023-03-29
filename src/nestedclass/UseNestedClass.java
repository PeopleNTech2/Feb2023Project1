package nestedclass;

public class UseNestedClass {
    public static void main(String[] args) {

        //object of outer class
        Outer outer = new Outer();

        outer.outerMethod();

        //use object of the outer class to call the object of the inner class to access inner class prop
        outer.inner.innerMethod();

    }
}
