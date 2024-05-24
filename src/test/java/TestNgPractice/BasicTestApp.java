package TestNgPractice;

import org.testng.annotations.Test;

public class BasicTestApp {
    @Test(priority = 1)
    void setup()
    {
        System.out.println("This is opening browser window");
    }

    @Test(priority = 2)
    void login()
    {
        System.out.println("Login into system");
    }

    @Test(priority = 3)
    void logout()
    {
        System.out.println("Logout successfully");
    }
}
