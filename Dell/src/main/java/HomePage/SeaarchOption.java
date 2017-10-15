package HomePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SeaarchOption extends CommonAPI {

    @FindBy(id = "search-input")
    WebElement searchOption;

    public void featuresSearchOption_1(String item_1) throws InterruptedException {
        searchOption.sendKeys(item_1);
        Thread.sleep(2000);

    }
    public void featuresearchOption_2(String item_2) throws InterruptedException {
        searchOption.sendKeys(item_2);
        Thread.sleep(2000);

    }
    public void featuresearchOption_3(String item_3) throws InterruptedException {
        searchOption.sendKeys(item_3);
        Thread.sleep(2000);

    }
    public void featuresearchOption_4( String item_4) throws InterruptedException {
        searchOption.sendKeys(item_4);
        Thread.sleep(2000);

    }
    public void featuresearchOption_5(String item_5) throws InterruptedException {
        searchOption.sendKeys(item_5);
        Thread.sleep(2000);

    }
    public void featuresearchOption_6(String item_6) throws InterruptedException {
        searchOption.sendKeys(item_6);
        Thread.sleep(2000);

    }
    public void featuresearchOption_7(String item_7) throws InterruptedException {
        searchOption.sendKeys(item_7);
        Thread.sleep(2000);

    }
}
