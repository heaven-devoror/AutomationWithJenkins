package Auto;

public class Day13 {

    static {
        System.out.println("Static block is invoked");
    }
    public static void static_method()
    {
        System.out.println("This is a static method whose scope is public");
    }

    /*
    static {
        System.out.println("Second Static block is invoked");
    }
    */
    public static void static_method2()
    {
        System.out.println("This is the second static method whose scope is public");
    }
    public static float pi = 3.14F;

}
