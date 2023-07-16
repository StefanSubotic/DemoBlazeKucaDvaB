import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NaviPage extends BasePage{


    @FindBy(id = "login2")
    WebElement login;

    @FindBy(linkText = "Home ")
    WebElement home;

    @FindBy(linkText = "Contact")
    WebElement contact;

    @FindBy(linkText = "About us")
    WebElement aboutAs;

    @FindBy(id = "cartur")
    WebElement cart;

    @FindBy(xpath = "//a[@id='nameofuser']")
    WebElement welcome;


    public NaviPage(ChromeDriver driver)
    {
      this.driver = driver;
        PageFactory.initElements(driver, this);
    }


}
