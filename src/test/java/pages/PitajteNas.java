package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class PitajteNas extends BasePage{


    @FindBy(xpath = "//textarea[@name = \"your-message\"]")
    public WebElement poruka;
    @FindBy (xpath = "//input[@type = \"email\"]")
    public WebElement emailInput;
    @FindBy (xpath = "//input[@name = \"quiz-738\"]")
    public WebElement quiz;
    @FindBy (xpath = "//input[@class = \"wpcf7-form-control wpcf7-submit\"]")
    public WebElement submit;



    public PitajteNas(ChromeDriver driver) {
        super(driver);
    }
}








