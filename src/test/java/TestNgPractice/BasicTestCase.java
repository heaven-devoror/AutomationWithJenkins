package TestNgPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BasicTestCase {
    @Test(priority = 1)
    void setup()
    {
        System.out.println("This is opening browser window");
    }

    @Test(priority = 2)
    void addCustomer()
    {
        System.out.println("Customer Added successfully");
        Assert.assertEquals(1,1);
    }

    @Test(priority = 3)
    void removeCustomer()
    {
        System.out.println("Customer Removed successfully");
    }

    @Test(priority = 4, enabled = false)
    void logout()
    {
        System.out.println("Logout successfully");
    }
}
