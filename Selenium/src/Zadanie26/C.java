package Zadanie26;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class C {
    @Test
    void A1() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        driver.manage().window().maximize();

        driver.get("https://www.automationtesting.co.uk/");
        driver.findElement(By.linkText("BROWSER TABS")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#main > div > div > div > form > input[type=submit]")).click();

        driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
        driver.get("https://www.dovoznakupov.sk");

        ((JavascriptExecutor) driver).executeScript("window.open();");
        driver.switchTo().window(driver.getWindowHandles().toArray()[2].toString());
        driver.get("https://www.automationtesting.sk");

        Thread.sleep(2000);
        driver.close();

        driver.switchTo().window(driver.getWindowHandles().toArray()[0].toString());
        driver.close();

        Thread.sleep(2000);
        driver.quit();
    }
}
