package TestNgPractice;

import org.testng.annotations.*;

public class TestCase2 {
    @BeforeClass
    void beforeClass()
    {
        System.out.println("This will execute before class");
    }

    @AfterClass
    void afterClass()
    {
        System.out.println("This will execute after class");
    }

    @BeforeMethod
    void beforeMethod()
    {
        System.out.println("This will execute before method");
    }

    @AfterMethod
    void afterMethod()
    {
        System.out.println("This will execute after method");
    }

    @Test
    void test3()
    {
        System.out.println("This is Test3");
    }

    @Test
    void test4()
    {
        System.out.println("This is Test4");
    }

    @BeforeSuite
    void beforeSuite()
    {
        System.out.println("This will execute before suite");
    }

    @AfterSuite
    void afterSuite()
    {
        System.out.println("This will execute after suite");
    }
}
