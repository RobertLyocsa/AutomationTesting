package Zadanie26;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class B {
    @Test
    void A1() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        driver.manage().window().maximize();

        driver.get("https://www.automationtesting.co.uk/");
        driver.findElement(By.cssSelector("body")).click();

        WebElement iFrame = driver.findElement(By.linkText("IFRAMES"));
        iFrame.click();

        //driver.manage().deleteAllCookies();

// iframe magic
        driver.switchTo().frame(0);
        WebElement xButton = driver.findElement(By.cssSelector("div.cookies > div > div > a.close-cookie-warning"));
        xButton.click();
        driver.switchTo().defaultContent();

        // Nedari sa mi najst ten spravny identifikator ako by som klikol na youtube ikonku v tabe. Takze som sa aspon pokusil spustit video inym sposobom a hladanim v source code;
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[src='https://www.youtube.com/embed/jNQXAC9IVRw']")));
        WebElement youtubeLink = driver.findElement(By.cssSelector("a[href='https://www.youtube.com/watch?v=jNQXAC9IVRw']"));
        youtubeLink.click();
        driver.switchTo().defaultContent();



        driver.close();
        driver.quit();
    }
}
