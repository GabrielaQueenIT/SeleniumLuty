package pl.testeroprogramowania;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pl.testeroprogramowania.BasePage;

import java.util.List;

@Listeners(value = {SampleTestListener.class})
public class FirstTest extends BasePage {

    WebDriver driver;
    WebElement para;

    @Test
    public void firstTest() {
        driver = DriverFactory.getDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/wait2.html");
        driver.findElement(By.id("clickOnMe")).click();
        waitForElementToExist(By.cssSelector("p"));

        para = driver.findElement(By.cssSelector("p"));

        Assert.assertEquals(para.isDisplayed(), false );
        Assert.assertTrue(para.isDisplayed(), "Element is not displayed");
        Assert.assertTrue(para.getText().startsWith("Dopiero"));
        Assert.assertFalse(para.getText().startsWith("Pojawiłek"));
        Assert.assertEquals(para.getText(), "Dopiero się pojawiłem!");
        Assert.assertEquals(para.getText(), "Dopiero się pojawiłem!", "Ojej! Teksty są różne! :(");

        driver.quit();
    }

    @Test
    public void secondTest() {

        driver = DriverFactory.getDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/wait2.html");
        driver.findElement(By.id("clickOnMe")).click();
        waitForElementToExist(By.cssSelector("p"));

        para = driver.findElement(By.cssSelector("p"));


        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals(para.isDisplayed(), true );
        softAssert.assertTrue(para.isDisplayed(), "Element is not displayed");
//        softAssert.assertEquals(para.getText(), "Dopiero się pdfhgfhbojawiłem!");
        softAssert.assertTrue(para.getText().startsWith("Dopiero"));
        softAssert.assertFalse(para.getText().startsWith("Pojawiłek"));
        softAssert.assertEquals(para.getText(), "Dopiero sfgdię pojawiłem!", "Ojej! Teksty są różne! :(");


        softAssert.assertAll();
        driver.quit();
    }

    public void waitForElementToExist(By locator) {

        WebDriverWait wait = new WebDriverWait(driver, 10);

        wait.until((driver -> {
                List<WebElement> elements = driver.findElements(locator);
                if(elements.size()>0) {
                    System.out.println("Element jest na stronie");
                    return true;
                } else {
                    System.out.println("Elementu nie ma na stronie");
                    return false;
                }

        }));
    }
}

//
