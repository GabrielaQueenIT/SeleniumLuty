import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class XPathTest { @Test
public void findElement() {

    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://testeroprogramowania.github.io/selenium/basics.html");

//        driver.findElement(By.cssSelector("div ul")).click();
//    driver.findElement(By.cssSelector("div > ul"));
    driver.findElement(By.xpath("//ul"));
    driver.findElement(By.xpath("//button[@id=\"clickOnMe\"]"));
    driver.findElement(By.xpath("//input[@name='fname']"));
    driver.findElement(By.xpath("//p[@class='topSecret']"));
    driver.findElement(By.xpath("//tbody/tr"));

    driver.findElement(By.xpath("//input[@id='fname']"));
    driver.findElement(By.xpath("//a[text()='Visit W3Schools.com!']"));
    driver.findElement(By.xpath("//a[contains(text(), 'Visit')]"));
    driver.findElement(By.xpath("//input[2]"));
    driver.findElement(By.xpath("//input[last()]"));
    driver.findElement(By.xpath("//*[@name]"));

//    System.out.println("Ten tekst to " + driver.findElement(By.xpath('//href[contain=\"w3schools.com\"]")).getText());
//    System.out.println("Tytuł pierwszej kolumny to: " + driver.findElement(By.cssSelector("th:first-child")).getText());
//    System.out.println("Tytuł drugiej kolumny to: " + driver.findElement(By.cssSelector("th:last-child")).getText());
//    System.out.println("Tytuł tej strony to: " + driver.findElement(By.cssSelector("a[href = \"https://www.google.com\"]")).getText());
////        driver.findElement(By.cssSelector("a[href = \"https://www.google.com\"]")).click();
//    System.out.println(driver.findElement(By.cssSelector("td:last-child")).getText());
//    driver.findElement(By.cssSelector("input[name=\"username\"]")).clear();
//    driver.findElement(By.cssSelector("input[name=\"username\"]")).sendKeys("Gabrysia");
//    System.out.println(driver.findElement(By.cssSelector("button#newPage")).getText());
//    System.out.println("To trudne " + driver.findElement(By.cssSelector("div > ul > li > ul > li")).getText());
//    System.out.println("To trudne " + driver.findElement(By.cssSelector("div ul li ul li")).getText());
//    driver.findElement(By.cssSelector("input[value*=\"ubm\"]")).click();

}
}