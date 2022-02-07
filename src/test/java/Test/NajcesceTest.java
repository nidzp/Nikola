package Test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.WebForm;

public class NajcesceTest {
    @Test

    public void najcesceTest() throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebForm webForm = new WebForm(driver);
        webForm.deleteAllCockies();
        Thread.sleep(3000);
        webForm.najcesce.click();
        Thread.sleep(3000);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", webForm.nepravilnostIli);
        webForm.nepravilnostIli.click();
        Thread.sleep(2000);
        driver.quit();



        {

            }
        }










        }


