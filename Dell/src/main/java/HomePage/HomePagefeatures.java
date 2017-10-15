package HomePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.io.IOException;

public class HomePagefeatures extends CommonAPI {

    @FindBy(how = How.XPATH,using = ".//*[@id='signin-button']")
    public static WebElement Go_Login_Btn;

    public void LoginFeature() throws InterruptedException, IOException {
        Go_Login_Btn.click();
        Thread.sleep(3000);
        takeScreenShot("AfterCaseStatus", "C:\\Users\\sujon\\IdeaProjects\\dellAutomation\\Dell\\screenshots");

    }
}
