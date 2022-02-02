package PagesVulkanKnjizare;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePageVK {
    public ChromeDriver driver;

    @FindBy(xpath = "//a[@title = \"KATEGORIJE\"]")
    public WebElement kategorije;
    @FindBy(xpath = "//button [@class = \"cookie-agree 3\"]")
    private WebElement cockies;
    @FindBy (xpath = "//a [@title = \"Kontakt\"]")
    public WebElement kontakt;




    public BasePageVK(ChromeDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void scrollIntoView(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

    }
    public boolean isElementPresent(WebElement webElement){
        try {
            return webElement.isDisplayed();
        } catch (final Exception e) {
            return false;
        }
    }

public void deleteAllCockies()
{if (isElementPresent(cockies)){
    cockies.click();
}







    }


}





