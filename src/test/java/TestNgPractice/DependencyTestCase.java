package TestNgPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyTestCase {

    @Test
    void startCar()
    {
        System.out.println("Car is starting");
        Assert.fail();
    }

    @Test(dependsOnMethods = {"startCar"})
    void driveCar()
    {
        System.out.println("Car is moving");
    }

    @Test(dependsOnMethods = {"driveCar"})
    void stopCar()
    {
        System.out.println("Car is stopped");
    }

    @Test(dependsOnMethods = {"driveCar", "stopCar"}, alwaysRun = true)
    void parkCar()
    {
        System.out.println("Car is parked");
    }

}

