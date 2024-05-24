package Day11;

public class Class1 {
    public void  example1()
    {
        System.out.println("Hello I'm a void method I don't return anything");
    }

    public int example2()
    {
        int number;
        number = 7;
        return number;
    }

    public String example3()
    {
        String message;
        message = "I am a string method and I return set of characters";
        return  message;
    }

    public Class1(int lucky)
    {
        System.out.println("Constructor1 invoked with number " + lucky);
    }

    public Class1(String name)
    {
        System.out.println("Constructor2 invoked with name : " + name);
    }


}
