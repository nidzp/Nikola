package TestVuklanKnjizare;;





import PagesVulkanKnjizare.HomePageVK;
import PagesVulkanKnjizare.KontaktVK;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class KontaktTestVK {


    @Test

    public void KontaktTest() throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        HomePageVK page = new HomePageVK(driver);
        driver.manage().window().maximize();
        page.deleteAllCockies();
        page.scrollIntoView(page.kontakt);
        page.kontakt.click();
        KontaktVK kontakt = new KontaktVK(driver);
        kontakt.setSendImeIPrezimeMetoda();
        Thread.sleep(1000);
        kontakt.posalji.click();
    }
}
