import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class BasicActionsTest {

    @Test
    public void findElement() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium");
        driver.findElement(By.xpath("//a[text()='Podstawowa strona testowa']")).click();
//        driver.findElement(By.id("clickOnMe")).click();
        WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
        username.clear();
        username.sendKeys("Gabrysia");
        System.out.println(username.getAttribute("value"));
//        username.sendKeys(Keys.TAB);
//        WebElement checkbox = driver.findElement(By.xpath("//*[@type='checkbox']"));
//        checkbox.click();
//        WebElement radio = driver.findElement(By.xpath("//input[@value ='female']"));
//        radio.click();
//
//        WebElement selectCar = driver.findElement(By.xpath("//select"));
//        Select cars = new Select(selectCar);
//        cars.selectByVisibleText("Saab");
//
//        List <WebElement> options = cars.getOptions();
//        for (WebElement option : options) {
//            System.out.println(option.getText());
//        }
//
//        SelectCheck check = new SelectCheck();
//        System.out.println(check.checkOption("Audi", selectCar));
//        System.out.println(check.checkOption("Mazda", selectCar));
//



    }
}
