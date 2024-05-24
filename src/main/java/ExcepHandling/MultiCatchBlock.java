package ExcepHandling;

public class MultiCatchBlock {
    public static void main(String[] args) {

        try {
//            int a[] = new int[5];
//            a[5] = 30/2;
//            System.out.println(a[10]);

            String s = null;
            System.out.println(s.length());
        }
        catch (ArithmeticException e)
        {
            System.out.println("Arithmetic exception error");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array out of bound error");
        }
        catch (Exception e)
        {
            System.out.println("Parent Exception occurs");
            System.out.println(e);
        }
        System.out.println("Rest of the code");
    }
}
