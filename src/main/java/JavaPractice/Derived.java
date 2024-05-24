package JavaPractice;

public class Derived extends Base {
    @Override
    void method(double d) {
        System.out.println("Derived class method called with double d =" + d);
//        System.out.println("Base class method called with double d =" + super.d);
    }
}
