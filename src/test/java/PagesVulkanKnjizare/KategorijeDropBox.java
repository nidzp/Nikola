package PagesVulkanKnjizare;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class KategorijeDropBox extends BasePageVK {
    @FindBy (xpath = "//a [@title = \"KNJIGE\"]")
    public WebElement knjige;
    @FindBy (xpath = "//a [@title = \"DOMAĆE KNJIGE\"]")
    public WebElement domaceKnjige;



    public KategorijeDropBox(ChromeDriver driver) {
        super(driver);
    }





}