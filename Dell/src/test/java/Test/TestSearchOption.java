package Test;

import HomePage.SeaarchOption;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestSearchOption extends CommonAPI {

    @Test
    public void SearchFeatures_1() throws InterruptedException {
        SeaarchOption seaarchOption = PageFactory.initElements(driver,SeaarchOption.class);
        seaarchOption.featuresSearchOption_1("Laptop");
    }
    @Test
    public void SearchFeatures_2() throws InterruptedException {
        SeaarchOption seaarchOption = PageFactory.initElements(driver,SeaarchOption.class);
        seaarchOption.featuresearchOption_2("Mobile");
    }
    @Test
    public void SearchFeatures_3() throws InterruptedException {
        SeaarchOption seaarchOption = PageFactory.initElements(driver,SeaarchOption.class);
        seaarchOption.featuresearchOption_3("Desktop");
    }
    @Test
    public void SearchFeatures_4() throws InterruptedException {
        SeaarchOption seaarchOption = PageFactory.initElements(driver,SeaarchOption.class);
        seaarchOption.featuresearchOption_4("Servers");
    }
    @Test
    public void SearchFeatures_5() throws InterruptedException {
        SeaarchOption seaarchOption = PageFactory.initElements(driver,SeaarchOption.class);
        seaarchOption.featuresearchOption_5("Monitors");
    }
    @Test
    public void SearchFeatures_6() throws InterruptedException {
        SeaarchOption seaarchOption = PageFactory.initElements(driver,SeaarchOption.class);
        seaarchOption.featuresearchOption_6("iPhone");
    }
    @Test
    public void SearchFeatures_7() throws InterruptedException {
        SeaarchOption seaarchOption = PageFactory.initElements(driver,SeaarchOption.class);
        seaarchOption.featuresearchOption_7("iPad");
    }
}
