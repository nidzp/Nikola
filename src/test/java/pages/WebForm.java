package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class WebForm extends BasePage{
    ChromeDriver driver;
    String baseUrl = "https://kakosepise.com/";

    @FindBy( className = "ui-autocomplete-input")
    public WebElement searchBar;
    @FindBy (id= "ksp-search-btn")
    public WebElement searchBarButton;
    @FindBy(xpath = "//a[text()=\"ne pravilnost ili nepravilnost\"]")
    public WebElement nepravilnostIli;





    public WebForm(ChromeDriver driver) {
        super(driver);
        driver.get(baseUrl);

    }
    }












