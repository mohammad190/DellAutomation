package Test;

import HomePage.HomePagefeatures;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestHomePageFea extends CommonAPI {
    @Test
    public void LoginFeatures() throws InterruptedException, IOException {
        HomePagefeatures homePagefeatures = PageFactory.initElements(driver,HomePagefeatures.class);
        homePagefeatures.LoginFeature();
    }
}
