package Zadanie26;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class A {

    @Test

    void A1() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));


        driver.manage().window().maximize();

        driver.get("https://automationbookstore.dev/.");

        WebElement resultElement = driver.findElement(By.id("searchBar"));


        WebElement searchBar = driver.findElement(By.id("searchBar"));
        searchBar.sendKeys("Advanced Selenium in Java");
        Thread.sleep(1500);
        resultElement.clear();

        searchBar.sendKeys("Java For Testers");
        Thread.sleep(1500);
        resultElement.clear();

        searchBar.sendKeys("The Cucumber for Java Book");
        Thread.sleep(1500);
        resultElement.clear();

        searchBar.sendKeys("BDD in Action");
        Thread.sleep(1500);

        System.out.println("Test successful");

        //driver.findElement(By.cssSelector("#demo-page > div.ui-content > form > div")).sendKeys("Advanced Selenium in Java");

        driver.close();

    }
    @Test
    void A2() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));


        driver.manage().window().maximize();

        driver.get("https://www.automationtesting.co.uk/contactForm.html");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement firstNameField = driver.findElement(By.name("first_name"));
        WebElement lastNameField = driver.findElement(By.name("last_name"));
        WebElement emailField = driver.findElement(By.name("email"));
        WebElement messageField = driver.findElement(By.name("message"));

        if (firstNameField.isEnabled() && lastNameField.isEnabled() && emailField.isEnabled() && messageField.isEnabled()) {
            System.out.println("Všetky polia formulára sú editovateľné.");
        } else {
            System.out.println("Chyba: Niektoré polia formulára nie sú editovateľné.");
        }

        firstNameField.sendKeys("Hello");
        lastNameField.sendKeys("World");
        emailField.sendKeys("email@email.com");
        messageField.sendKeys("No comment");

        driver.findElement(By.cssSelector("input[type='reset'][value='RESET']")).click();
        driver.findElement(By.cssSelector("input[type='submit'][value='SUBMIT']")).click();

        WebElement errorMessage = driver.findElement(By.xpath("//body[contains(., 'Error: all fields are required')]"));
        System.out.println(errorMessage.getText());


        driver.close();
        driver.quit();

    }
}
