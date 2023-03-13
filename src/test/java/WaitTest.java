import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class WaitTest {

    WebDriver driver;
    @Test
    public void waitTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://testeroprogramowania.github.io/selenium/wait2.html");

        driver.findElement(By.id("clickOnMe")).click();
//        Thread.sleep(5000);

//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("p")));
//        driver.findElement(By.cssSelector("p"));

        WebDriverWait wait = new WebDriverWait(driver, 10);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("p")));

//        driver.findElement(By.cssSelector("p"));
        waitForElementToExist(By.cssSelector("p"));
    }

    public void waitForElementToExist(By locator) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(new Function<WebDriver, Boolean>() {
            @Override
            public Boolean apply(WebDriver driver) {
                List<WebElement> elements = driver.findElements(locator);
                if(elements.size()>0) {
                    System.out.println("Element jest na stronie");
                    return true;
                } else {
                    System.out.println("Elementu nie ma na stronie");
                    return false;
                }
            }
        });

    }
}
