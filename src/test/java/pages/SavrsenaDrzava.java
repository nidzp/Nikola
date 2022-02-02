package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class SavrsenaDrzava extends BasePage{

    @FindBy(xpath = "//a[@title = \"Posetite blog\"]")
    private WebElement blog;
    public SavrsenaDrzava(ChromeDriver driver) {
        super(driver);
    }

    public void clickOnBlog(){
        blog.click();
    }
}
