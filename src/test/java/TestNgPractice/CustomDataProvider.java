package TestNgPractice;

import org.testng.annotations.DataProvider;

public class CustomDataProvider {
    @DataProvider(name = "LoginDataProvider")
    public Object[][] getData()
    {
        Object[][] data = {{"abc@gmail.com","abc"},{"monkey@yahoo.com","monkey"},{"goal@gmail.com","goal"}};
        return data;
    }
}
