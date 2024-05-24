package ExcepHandling;

public class JavaExceptionExample {
    public static void main(String[] args) {
        try {
            int []a = {1,2,3,4,5};
            System.out.println(a[19]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
            System.out.println("Array index out of bound");
        }
        System.out.println("Rest of the code");

    }
}
