package PagesVulkanKnjizare;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class KategorijeAddToCart extends BasePageVK {
    @FindBy (className = "btn confirm-loader")
    public WebElement ucenickiPriborScroll;
    @FindBy (xpath = "/html/body/div[4]/div[1]/div/div/div/div[1]/div/div[2]/div/div/div[7]/div[1]/a/span")
    public WebElement firstItem;
    @FindBy (xpath = "/html/body/div[4]/div[1]/div/div/div/div[1]/div/div[2]/div/div/div[7]/div[3]/div[10]/div/div[1]/button")
    private WebElement addToCart;
    @FindBy (xpath = "//div [@class = \"header-carthor-total\"]")
    public WebElement cart;

    public KategorijeAddToCart(ChromeDriver driver) {
        super(driver);
    }

    public void addToCartClick(){
        addToCart.click();}
}
