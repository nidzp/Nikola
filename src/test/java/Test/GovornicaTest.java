package Test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.Govornica;
import pages.WebForm;

public class GovornicaTest {

    @Test

    public void govornicaClickOnFirst4() throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        WebForm page = new WebForm(driver);
        Govornica govornica = new Govornica(driver);
        driver.manage().window().maximize();
        page.govornica.click();
        govornica.clickOnAnglosrpskiAndGoBack();
        Thread.sleep(1000);
        govornica.clickOnJezickeIdeologijeAndGoBack();
        Thread.sleep(1000);
        govornica.clickOnJezickiImperijalizamAndGoBack();
        Thread.sleep(1000);
        driver.quit();







    }
}
