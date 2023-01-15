import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PMI {
    private WebDriver _driver;
    public PMI(WebDriver driver){
        PageFactory.initElements(driver, this);
        _driver=driver;
    }

    public void CreateUser() throws InterruptedException {

        List<WebElement> menus = _driver.findElements(By.className("oxd-main-menu-item--name"));
        menus.get(1).click();

        List<WebElement> add_btn = _driver.findElements(By.className("oxd-button"));
        add_btn.get(2).click();

        Thread.sleep(2000);

        List<WebElement> input = _driver.findElements(By.className("oxd-input"));
        input.get(1).sendKeys("Farjana");
        input.get(2).sendKeys("");
        input.get(3).sendKeys("Nishy");
        List<WebElement> radio_btn = _driver.findElements(By.className("oxd-switch-wrapper"));
        radio_btn.get(0).click();
        Thread.sleep(2000);


        List<WebElement> input_ext = _driver.findElements(By.className("oxd-input"));
        input.get(5).sendKeys("Nishy1");
        input.get(6).sendKeys("Nishy@12");
        input.get(7).sendKeys("Nishy@12");

        List<WebElement> submit = _driver.findElements(By.className("oxd-button"));
        submit.get(1).click();


    }
    public void UserSearch() throws InterruptedException {

        List<WebElement> menus = _driver.findElements(By.className("oxd-main-menu-item--name"));
        menus.get(1).click();

        List<WebElement> input_fields = _driver.findElements(By.tagName("input"));
        input_fields.get(1).sendKeys("Farjana");

        Thread.sleep(2000);

        List<WebElement> btn = _driver.findElements(By.className("oxd-button"));
        btn.get(1).click();
    }
}
