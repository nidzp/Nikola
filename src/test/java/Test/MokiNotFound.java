package Test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.WebForm;

public class MokiNotFound {

    @Test

    public void clickOnMokiPageNotFoundTest() throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebForm page = new WebForm(driver);
        page.deleteAllCockies();
        page.preporucujemo.click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",page.mokiInstalater);
        Thread.sleep(3000);
        page.mokiInstalater.click();
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.quit();

    }
}
