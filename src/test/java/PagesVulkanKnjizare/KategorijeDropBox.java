package PagesVulkanKnjizare;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class KategorijeDropBox extends BasePageVK {
    @FindBy (xpath = "//a [@title = \"KNJIGE\"]")
    public WebElement knjige;
    @FindBy (xpath = "/html/body/div[1]/div[3]/nav/div/ul/li[2]/div/div/ul/li[1]/div/div/div/div/div/div[1]/div/ul/li/a")
    public WebElement pogledajSve;



    public KategorijeDropBox(ChromeDriver driver) {
        super(driver);
    }





}