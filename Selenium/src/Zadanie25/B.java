package Zadanie25;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class B {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        driver.manage().window().maximize();

        driver.get("https://www.automationtesting.co.uk/");
        Thread.sleep(1500);
        driver.findElement(By.cssSelector("body")).click();
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");

        WebElement loaderLink = driver.findElement(By.cssSelector("#menu > ul > li:nth-child(14) > a"));
        loaderLink.click();

        WebElement appears = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#appears")));
        Assertions.assertTrue(appears.isDisplayed(), "Paragraph is visible");
        System.out.println("Paragraph is visible");

        driver.quit();
    }
}