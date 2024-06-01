package Zadanie25;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class A {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        driver.manage().window().maximize();

        driver.get("https://www.automationtesting.co.uk/");
        driver.findElement(By.cssSelector("body")).click();

        WebElement loaderLink = driver.findElement(By.linkText("LOADER"));
        loaderLink.click();

        WebElement loaderButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#loaderBtn")));
        loaderButton.click();
        Assertions.assertTrue(loaderButton.isDisplayed(), "Button is visible");
        System.out.println("Button is visible");

        driver.close();
        driver.quit();
    }
}
