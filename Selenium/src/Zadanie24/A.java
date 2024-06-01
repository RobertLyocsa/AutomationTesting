package Zadanie24;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class A {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        Thread.sleep(3000);

        driver.manage().window().maximize();

        driver.get(" https://www.automationtesting.co.uk/");

        driver.findElement(By.cssSelector("body")).click();

        driver.findElement(By.cssSelector("#menu > ul > li:nth-child(2) > a")).click();

        // nefunguje driver.findElement(By.linkText("Platform Portability")).click();

        driver.findElement(By.cssSelector("#main > div > div > div > div:nth-child(1)")).click();
        driver.findElement(By.cssSelector("#main > div > div > div > div:nth-child(3)")).click();
        driver.findElement(By.cssSelector("#main > div > div > div > div:nth-child(5)")).click();

        Thread.sleep(3000);

        driver.findElement(By.cssSelector("#main > div > div > div > div:nth-child(1)")).click();
        driver.findElement(By.cssSelector("#main > div > div > div > div:nth-child(3)")).click();
        driver.findElement(By.cssSelector("#main > div > div > div > div:nth-child(5)")).click();

        System.out.println("Accordion prebehol uspesne");
        Thread.sleep(3000);

        driver.findElement(By.linkText("BUTTONS")).click();

        driver.findElement(By.cssSelector("#btn_one")).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        // place ze Selenium nepodporuje @BeforeEach

        Thread.sleep(3000);
        //driver.findElement(By.id("1")).sendKeys(Keys.ENTER);


        driver.findElement(By.cssSelector("#btn_two")).click();


        Thread.sleep(3000);
        //driver.findElement(By.linkText("OK")).click();
        alert.accept();


        driver.findElement(By.cssSelector("#btn_three")).click();
        Thread.sleep(3000);
        alert.accept();

        System.out.println("Normalne Buttony prebehli uspesne");


        WebElement lastButton = driver.findElement(By.id("btn_four"));
        boolean isClickable = lastButton.isEnabled();
        if (isClickable) {
            Assertions.fail("Posledný button je klikateľný.");
        } else {
            System.out.println("Posledný button nie je klikateľný.");
        }

        driver.close();
        driver.quit();

    }
}
