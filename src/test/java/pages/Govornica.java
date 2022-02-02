package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class Govornica extends BasePage {
    @FindBy (xpath = "//a [@title = \"Permalink to Anglosrpski\"]")
    private WebElement anglosrpski;
    @FindBy (xpath = "//a [@title = \"Permalink to Jezički imperijalizam i lingvicizam\"]")
    private WebElement jezickiImperijalizam;
    @FindBy(xpath = "//a [@title = \"Permalink to Jezičke ideologije\"]")
    private WebElement jezickeIdeologije;
    public Govornica(ChromeDriver driver) {
        super(driver);
    }

    public void clickOnAnglosrpskiAndGoBack(){
        anglosrpski.click();
        driver.navigate().back();
    }

    public void clickOnJezickiImperijalizamAndGoBack(){
        jezickiImperijalizam.click();
        driver.navigate().back();
    }
    public void clickOnJezickeIdeologijeAndGoBack(){
        jezickeIdeologije.click();
        driver.navigate().back();
    }
}
