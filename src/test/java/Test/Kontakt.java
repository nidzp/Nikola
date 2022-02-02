package Test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.PitajteNas;
import pages.WebForm;

public class Kontakt  {

    @Test

    public void KontaktirajNas() throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebForm webForm = new WebForm(driver);
        PitajteNas page = new PitajteNas(driver);
        webForm.pitajteNas.click();

        Thread.sleep(2000);

        page.emailInput.sendKeys("nikola123@gmail.com");
        Thread.sleep(2000);
        page.poruka.sendKeys("Pozdrav");
        Thread.sleep(2000);
        page.quiz.sendKeys("9");
        page.submit.click();
        driver.quit();







    }

}
