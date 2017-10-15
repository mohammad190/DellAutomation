package base;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class CommonAPI {

    public static WebDriver driver = null;

    //private static String url ="https://www.iconacademe.com/";

    @Parameters({"browserName", "os","url"})
    @BeforeMethod
    public void setUp(String browserName, String os, String URL){

        System.setProperty("webdriver.chrome.driver","C:\\Users\\sujon\\IdeaProjects\\dellAutomation\\Generic\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        //driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
        driver.get(URL);
        //driver.navigate().to(url);
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void tearDown(){
        driver.close();
    }

    public void takeScreenShot(String screenShotName, String Path) throws IOException {
        String fileName = screenShotName + ".png";
        String directory = Path;
        File sourceFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(sourceFile, new File(directory + fileName));
    }
}
