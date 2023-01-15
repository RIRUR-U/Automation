import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Runner extends Setup {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";
    String userName = "Admin";
    String password = "admin123";

    @Test(priority = 1)
    public void Login()
    {
        driver.get(baseUrl);
        LoginPage page = new LoginPage(driver);
        page.Dologin(userName,password);
    }

    @Test(priority = 2)
    public void CreateUser() throws InterruptedException
    {
        driver.get(baseUrl);
        PMI page = new PMI(driver);
        page.CreateUser();
        Thread.sleep(10000);

         List<WebElement> responses = driver.findElements(By.className("oxd-text--h6"));
        String actualResult_1 = responses.get(1).getText();
        String actualResult_2 = responses.get(2).getText();
        String expectedResult_1 = "Farjana Nishy";
        String expectedResult_2 = "Personal Details";

        Assert.assertEquals(actualResult_1,expectedResult_1);
        Assert.assertEquals(actualResult_2,expectedResult_2);
    }
     @Test(priority = 3)
        public void UserSearch() throws InterruptedException{
        driver.get(baseUrl);
        PMI page = new PMI(driver);
        page.UserViewWithSearch();

        Thread.sleep(5000);

        List<WebElement> responses = driver.findElements(By.className("oxd-text--span"));
        String actualResult = responses.get(11).getText();
        String expectedResult = "(1) Record Found";

        Assert.assertEquals(actualResult,expectedResult);
    }
}
