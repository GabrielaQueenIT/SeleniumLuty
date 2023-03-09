import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.util.List;


public class SelectorTest {

    @Test
    public void findElement() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
//        driver.findElement(By.id("clickOnMe")).click();
//        driver.findElement(By.name("fname")).sendKeys("Gabrysia");
        List<WebElement> inputs = driver.findElements(By.tagName("input"));
        System.out.println("Wszystkich inputów jest: " + inputs.size());


        }

}
