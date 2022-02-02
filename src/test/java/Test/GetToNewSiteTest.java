package Test;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.SavrsenaDrzava;
import pages.SerboFrenGlish;
import pages.WebForm;

public class GetToNewSiteTest {

    @Test

    public void serboFrenGlish() throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebForm page = new WebForm(driver);
        SerboFrenGlish sfg = new SerboFrenGlish(driver);
        page.deleteAllCockies();
        page.preporucujemo.click();
        Thread.sleep(2000);
        page.serbofrenglish.click();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(1000);
        page.clickObSavrsenaDrzava();
        Thread.sleep(2000);
        SavrsenaDrzava sd = new SavrsenaDrzava(driver);
        sd.clickOnBlog();
        Thread.sleep(1000);
        driver.navigate().back();
        driver.navigate().back();
        Thread.sleep(2000);

        driver.quit();


    }
}
