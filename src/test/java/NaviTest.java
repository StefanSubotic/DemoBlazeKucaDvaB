import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class NaviTest extends BaseTest {
    WebDriverWait wait;
    NaviPage naviPage;
    IndexPage indexPage;

    @BeforeMethod
    public void setUp()
    {
        driver = openBrowser();
        naviPage = new NaviPage(driver);
        indexPage = new IndexPage(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));


    }
    @Test
    public  void BuySamsungS6Phone()
    {
    indexPage.clickSamsunsS6();
    indexPage.addToCartSamsunsS6();
    }
}
