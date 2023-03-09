import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumTest {

    @Test
    public void openGooglePage() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.google.com");
        driver.findElement(By.id("L2AGLb")).click();
        WebElement searchField = driver.findElement(By.className("gLFyf"));
        searchField.sendKeys("Selenium");
        searchField.sendKeys(Keys.ENTER);
        WebElement result = driver.findElement(By.xpath("//a[contains(@href,'selenium.dev')]//h3"));

        Assert.assertTrue(result.isDisplayed());

        driver.close();


    }


//    public WebDriver getDriver(String browser) {
//        switch(browser) {
//            case "chrome":
//                return new ChromeDriver();
//            case "firefox":
//                return new FirefoxDriver();
//            default:
//                throw new InvalidArgumentException("Invalid browser name");
//        }
//    }
}
