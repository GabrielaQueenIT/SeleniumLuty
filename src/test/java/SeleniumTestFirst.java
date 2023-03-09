import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SeleniumTestFirst {

    @Test
    public void openGooglePage() {
//        System.setProperty("webdriver.ie.driver", "C:\\Users\\gabad\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");



        WebDriver driver = getDriver("chrome");
        driver.get("http://google.com");
//        driver.close();
    }

    public WebDriver getDriver(String browser) {

        switch (browser){
            case "chrome":
                String chromePath = "C:\\Users\\gabad\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe";
                System.setProperty("webdriver.chrome.driver", chromePath);
                return new ChromeDriver();
            case "firefox":
                String firefoxPath = "C:\\Users\\gabad\\OneDrive\\Desktop\\geckodriver-v0.32.2-win32\\geckodriver.exe";
                System.setProperty("webdriver.gecko.driver", firefoxPath);
                return new FirefoxDriver();
            default:
                throw new InvalidArgumentException("Invalid browser name");


        }
    }


}
