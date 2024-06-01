package Zadanie25;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class C {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.automationtesting.sk/");
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("[href='date.php']")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        WebElement redButton = driver.findElement(By.id("redButton"));
        String backgroundColorRed = redButton.getCssValue("background-color");
        System.out.println("Background color: " + backgroundColorRed);
        Assertions.assertEquals("rgba(0, 0, 0, 1)", backgroundColorRed);
        redButton.click();

        wait.until(ExpectedConditions.attributeContains(redButton, "style", "background-color: white;"));
        String newBackgroundColorRed = redButton.getCssValue("background-color");
        System.out.println("Background color: " + newBackgroundColorRed);
        Assertions.assertNotEquals("rgba(0, 0, 0, 1)", newBackgroundColorRed);

        WebElement blueButton = driver.findElement(By.id("blueButton"));
        String backgroundColorBlue = blueButton.getCssValue("background-color");
        Assertions.assertEquals("rgba(0, 0, 0, 1)", backgroundColorBlue);
        blueButton.click();
        wait.until(ExpectedConditions.attributeContains(blueButton, "style", "background-color: green;"));
        String newBackgroundColorBlue = blueButton.getCssValue("background-color");
        Assertions.assertNotEquals("rgba(0, 0, 0, 1)", newBackgroundColorBlue);

        WebElement greenButton = driver.findElement(By.id("greenButton"));
        String backgroundColorGreen = greenButton.getCssValue("background-color");
        Assertions.assertEquals("rgba(0, 0, 0, 1)", backgroundColorGreen);
        greenButton.click();
        wait.until(ExpectedConditions.attributeContains(greenButton, "style", "background-color: yellow;"));
        String newBackgroundColorGreen = greenButton.getCssValue("background-color");
        Assertions.assertNotEquals("rgba(0, 0, 0, 1)", newBackgroundColorGreen);

        WebElement yellowButton = driver.findElement(By.id("yellowButton"));
        String backgroundColorYellow = yellowButton.getCssValue("background-color");
        Assertions.assertEquals("rgba(0, 0, 0, 1)", backgroundColorYellow);
        yellowButton.click();
        wait.until(ExpectedConditions.attributeContains(yellowButton, "style", "background-color: red;"));
        String newBackgroundColorYellow = yellowButton.getCssValue("background-color");
        Assertions.assertNotEquals("rgba(0, 0, 0, 1)", newBackgroundColorYellow);

        Thread.sleep(2000);
        driver.close();
        driver.quit();
    }
}
