import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GooglePage {

    @Test
    public void searchInGoogle() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        driver.get("https://google.pl");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[text()='Zaakceptuj wszystko']")).click();
    }
}
