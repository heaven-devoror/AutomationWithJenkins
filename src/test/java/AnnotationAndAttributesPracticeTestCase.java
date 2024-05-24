import org.testng.Assert;
import org.testng.annotations.*;

public class AnnotationAndAttributesPracticeTestCase {

    @BeforeSuite
    void beforeSuite()
    {
        System.out.println("This method will run single time before suite");
    }

    @BeforeTest
    void beforeTest()
    {
        System.out.println("This method will run single time before test");
    }

    @BeforeClass
    void beforeClass() {
        System.out.println("This method will run single time before class");
    }

    @BeforeMethod
    void beforeMethod() {
        System.out.println("This method will run before every method");
    }

    @Test(priority = 3)
    void test1() {
        System.out.println("This is test 1");
    }

    @Test(priority = 2)
    void test2() {
        System.out.println("This is test 2");
    }

    @Test(priority = 1)
    void test3() {
        System.out.println("This is test 3");
    }

    @Test(dependsOnMethods = "test3")
    void test4() {
        System.out.println("This is test 4");
        Assert.assertEquals(2,1);
    }

    @Test(dependsOnMethods = "test4")
    void test5() {
        System.out.println("This is test 5");
    }

    @Test(enabled = false)
    void test6() {
        System.out.println("This is test 6");
    }

    @AfterMethod
    void afterMethod() {
        System.out.println("This method will run after every method");
    }

    @AfterClass
    void afterClass()
    {
        System.out.println("This method will run one time after class");
    }

    @AfterTest
    void afterTest()
    {
        System.out.println("This method will run single time after test");
    }

    @AfterSuite
    void afterSuite()
    {
        System.out.println("This method will run single time after suite");
    }
}
