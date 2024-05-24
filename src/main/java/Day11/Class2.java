package Day11;

public class Class2 {
    public static void main(String[] args) {
        Class1 key = new Class1(7);
        Class1 obj = new Class1("Ravi");

        System.out.println();
        System.out.println("**** 'key' object ****");
        key.example1();
        System.out.println("I am a int method and I return a number "+key.example2());
        System.out.println(key.example3());

        System.out.println();
        System.out.println("**** 'obj' object ****");
        obj.example1();
        System.out.println("I am a int method and I return a number "+obj.example2());
        System.out.println(obj.example3());
    }

}
