import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FindSeleniumTutorial {

    @Test
    public void findSeleniumTutorial() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://seleniumdemo.com/");
        driver.findElement(By.xpath("//a[contains(@href,'http://seleniumdemo.com/?page_id=4')]")).click();
        WebElement result = driver.findElement(By.xpath("//h2[text()='Java Selenium WebDriver']"));

        Assert.assertTrue(result.isDisplayed());

        driver.quit();
    }


}
