package ExcepHandling;

public class NestedTryBlock {
    public static void main(String[] args) {

        try {
            try {
                System.out.println("Divide by zero");
                int a = 40/0;
            }
            catch (ArithmeticException e)
            {
                System.out.println("Can't divide by zero");
                System.out.println(e);
            }
            try {
                System.out.println("Index out of range");
                int a[] = new int[5];
                a[5] = 66;
                System.out.println(a[10]);
            }
            catch (ArrayIndexOutOfBoundsException e)
            {
                System.out.println(e);
            }
            System.out.println("Other statements");
        }
        catch (Exception e)
        {
            System.out.println("Handle exception (outer flow)");
        }
    }
}
