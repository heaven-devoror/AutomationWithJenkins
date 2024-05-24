package Auto;

public class Day12 {

    public void greetings()
    {
        System.out.println("Hello everyone. I am a public method and accessible everywhere.");
    }
    public  String cat_name = "Kitty";

    void default_method()
    {
        System.out.println("I am a default method. I am only accessible inside the package where I am defined.");
    }
    String default_variable = "I am a default variable. I am only accessible inside the package where I am defined.";
    private int account_number = 123456789;
    private void account_details()
    {
        System.out.println("Your account number is " + account_number + ". This is a private method.");

    }

    public void show_account_info()
    {
        System.out.printf("Private Account number : " + account_number);
        System.out.println();
        account_details();
    }

    public void default_access()
    {
        System.out.println(default_variable);
        default_method();
    }
}
