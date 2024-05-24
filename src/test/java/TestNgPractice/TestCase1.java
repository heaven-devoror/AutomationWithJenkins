package TestNgPractice;

import org.testng.annotations.*;

import javax.sound.midi.Soundbank;

public class TestCase1 {
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
    void test1()
    {
        System.out.println("This is Test1");
    }

    @Test
    void test2()
    {
        System.out.println("This is Test2");
    }

    @BeforeTest
    void beforeTest()
    {
        System.out.println("This will execute before Test");
    }

    @AfterTest
    void afterTest()
    {
        System.out.println("This will execute after Test");
    }
}
