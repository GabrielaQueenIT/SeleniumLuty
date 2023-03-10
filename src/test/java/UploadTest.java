import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class UploadTest {

    @Test
    public void executeJavascript() throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        int randomNumber = (int) (Math.random()*1000);

        driver.get("https://testeroprogramowania.github.io/selenium/fileupload.html");
        driver.findElement(By.id("myFile")).sendKeys("C:\\Users\\gabad\\OneDrive\\Dokumenty\\proba.txt");
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
        String fileName = "Upload" + randomNumber + ".png";
        FileUtils.copyFile(srcFile, new File("src/test/resources/" + fileName));


    }
}
