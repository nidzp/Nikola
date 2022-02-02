package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    public ChromeDriver driver;

    @FindBy (id = "menu-item-490700")
    public WebElement preporucujemo;

    @FindBy (className = "home page-template-default page page-id-1292844 custom-font-enabled")
    public WebElement searchInput;

    @FindBy (id = "menu-item-794155")
    public WebElement pitajteNas;

    @FindBy (id = "ksp-search-btn")
    public WebElement searchButton;

    @FindBy (id = "menu-item-2214")
    public WebElement dobrodoslica;

    @FindBy (id = "menu-item-2141")
    private WebElement index;

    @FindBy (id = "menu-item-2140")
    public WebElement najcesce;

    @FindBy (className = "ctcc-right-side")
    private WebElement cockies;

    @FindBy (className = "nav-next")
    private WebElement nextSuggestion;

    @FindBy (className = "nav-previous")
    private WebElement previousSuggestion;

    @FindBy(className = "ns-se3ds-e-17")
    public WebElement add;

    @FindBy (xpath = "//a[@title = \"Moki - vodoinstalater\"]")
    public WebElement mokiInstalater;

    @FindBy(xpath = "//a[@title = \"serbofrenglish\"]")
    public WebElement serbofrenglish;

    @FindBy (id = "lat-lang")
    public WebElement latinica;

    @FindBy (xpath = "//a[@title = \"Savršena država\"]")
    private WebElement savrsenaDrzava;

    @FindBy (xpath = "//p[text() = \"E. Fekete: Jezičke doumice (knjiga druga), Beogradska knjiga, Beograd, 2008\"]")
    public WebElement fekete;

    @FindBy (id = "menu-item-2139")
    public WebElement literatura;

    @FindBy (id = "menu-item-1170781")
    public WebElement govornica;





    public BasePage(ChromeDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void waitUntilVisible (WebElement webElement, int timeOutInSeconds){
        WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
        wait.until(ExpectedConditions.visibilityOf(webElement));
    }

    public void waitUntilClickable (WebElement webElement, int timeOutInSeconds){
        WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
        wait.until(ExpectedConditions.elementToBeClickable(webElement));
    }

    public boolean isElementPresent(WebElement webElement){
        try {
            return webElement.isDisplayed();
        } catch (final Exception e) {
            return false;
        }
    }




    public void browserRefresh (){
        driver.navigate().refresh();
    }


    public void deleteAllCockies(){
        cockies.click();
    }

    public void clickNext(){
        nextSuggestion.click();
    }

    public void clickPrevious(){
        previousSuggestion.click();
    }
    public void clickOnIndex(){
        index.click();


    } public void clickObSavrsenaDrzava(){
        savrsenaDrzava.click();
    }


    }
























