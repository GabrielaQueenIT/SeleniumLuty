package pl.testeroprogramowania;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;

public class SampleTestListener implements ITestListener{



    @Override
    public void onTestFailure(ITestResult result) {

        WebDriver driver = DriverFactory.getDriver();

        int FileNUmber = (int)(Math.random()*1000);
        System.out.println("I am taking screenshot");
        String name = "failedTest" + FileNUmber + ".png";
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(srcFile, new File("src/test/resources/" + name));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
