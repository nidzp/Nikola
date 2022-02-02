package TestVuklanKnjizare;



import PagesVulkanKnjizare.HomePageVK;
import PagesVulkanKnjizare.KategorijeAddToCart;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class KategorijeTest {
    ChromeDriver driver;

  @Test

    public void AddToCartKategorije() throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        HomePageVK page = new HomePageVK(driver);
        KategorijeAddToCart test = new KategorijeAddToCart(driver);
        driver.manage().window().maximize();
        page.deleteAllCockies();
        page.kategorije.click();
        Actions actions = new Actions(driver);
        actions.moveToElement(test.firstItem).perform();
        test.addToCartClick();
        Thread.sleep(1000);
        actions.moveToElement(test.cart).perform();
        Thread.sleep(3000);
        driver.quit();










}}
