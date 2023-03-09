import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OliniPage {

    @Test
    public void findElement() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://olini.pl/?gclid=Cj0KCQiApKagBhC1ARIsAFc7Mc4u8aoqMX51s5vXrY2UCySlFB8dxY0c44hpPyUgVb61xstwpSjwm9oaAgFFEALw_wcB");

        driver.findElement(By.cssSelector("a[href*=\"kategoria/oleje\"]")).click();




    }
}
