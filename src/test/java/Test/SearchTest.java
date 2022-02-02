package Test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.WebForm;

public class SearchTest {

    @Test

    public void searchSomething () throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebForm webForm = new WebForm(driver);
        webForm.deleteAllCockies();
        webForm.searchBar.sendKeys("sa mnom");
        Thread.sleep(3000);

        webForm.searchBarButton.click();
        Thread.sleep(3000);

        webForm.clickNext();
        Thread.sleep(3000);

        webForm.clickPrevious();
        Thread.sleep(3000);

        driver.quit();






    }
}