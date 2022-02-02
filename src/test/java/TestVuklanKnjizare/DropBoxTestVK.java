package TestVuklanKnjizare;



import PagesVulkanKnjizare.HomePageVK;
import PagesVulkanKnjizare.KategorijeDropBox;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Coordinates;
import org.testng.annotations.Test;

public class DropBoxTestVK {

     {
    }

    @Test

    public void kategorijeDropBox() throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        HomePageVK page = new HomePageVK(driver);
        KategorijeDropBox test = new KategorijeDropBox(driver);
        driver.manage().window().maximize();
        page.deleteAllCockies();
        Actions actions = new Actions(driver);
        actions.moveToElement(page.kategorije).perform();
        Thread.sleep(1000);
        actions.moveToElement(test.knjige).perform();
        Thread.sleep(2000);
        test.pogledajSve.click();
        driver.quit();

    }
}
