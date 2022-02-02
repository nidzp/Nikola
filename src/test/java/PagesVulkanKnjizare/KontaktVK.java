package PagesVulkanKnjizare;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class KontaktVK extends BasePageVK {
    @FindBy(xpath = "//input [@id = \"name\"]")
    private WebElement sendImeIPrezime;
    @FindBy(id = "contact_submit")
    public WebElement posalji;



    public KontaktVK(ChromeDriver driver) {
        super(driver);
    }



    public void setSendImeIPrezimeMetoda(){
        sendImeIPrezime.sendKeys("Nikola");

    }
}
