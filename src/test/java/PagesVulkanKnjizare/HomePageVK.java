package PagesVulkanKnjizare;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import javax.print.attribute.standard.PagesPerMinute;

public class HomePageVK extends BasePageVK {
    ChromeDriver driver;
    String baseUrl = "https://www.knjizare-vulkan.rs/";





    public HomePageVK(ChromeDriver driver) {
        super(driver);
        driver.get(baseUrl);




    }
}
