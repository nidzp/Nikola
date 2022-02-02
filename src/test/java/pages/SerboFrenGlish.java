package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class SerboFrenGlish extends BasePage{

    String sfg1Url = "http://serbofrenglish.com/";
    @FindBy (className = "search-field")
    public WebElement searchSFG;
    @FindBy (className = "cat-item cat-item-56")
    public WebElement unrecocnized;


    public SerboFrenGlish(ChromeDriver driver) {
        super(driver);
    }
}
