package Zadanie24;

import net.bytebuddy.implementation.bytecode.Throw;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class B {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        Thread.sleep(3000);

        driver.manage().window().maximize();

        driver.get(" https://www.automationtesting.co.uk/");

        driver.findElement(By.cssSelector("body")).click();

        driver.findElement(By.cssSelector("#menu > ul > li:nth-child(9) > a")).click();


        driver.findElement(By.cssSelector("#main > div > div:nth-child(5) > div:nth-child(1) > div:nth-child(3) > label")).click();
        driver.findElement(By.cssSelector("#main > div > div:nth-child(5) > div:nth-child(2) > label:nth-child(6)")).click();
        driver.findElement(By.cssSelector("#main > div > div:nth-child(5) > div:nth-child(2) > label:nth-child(8)")).click();

        Thread.sleep(3000);
        System.out.println("Button & Checkboxes");

        driver.findElement(By.linkText("Animals")).click();
        driver.findElement(By.linkText("Mouse")).click();
        Thread.sleep(2000);
        String currentUrl = driver.getCurrentUrl();
        Assertions.assertTrue(driver.getPageSource().contains("You clicked on menu option 'Mouse'"));
        System.out.println("Animals is Visible");



        driver.findElement(By.linkText("Sports")).click();
        driver.findElement(By.linkText("Rugby")).click();
        //Assertions.assertTrue(currentUrl.contains("You clicked on menu option 'Rugby'"));
        //Thread.sleep(2000);
        //Assertions.assertTrue(driver.getPageSource().contains("You clicked on menu option 'Rugby'"));


        Boolean isVisible = driver.findElement(By.cssSelector("#outputMessage")).isDisplayed();
        Assertions.assertTrue(isVisible);
        Thread.sleep(2000);

        System.out.println("Sports is Visible");

        //DropDown menu car

        Select select = new Select(driver.findElement(By.cssSelector("#cars")));
        select.selectByIndex(4); //chcem Jeep
        System.out.println("Dropdown Menu cars was successful!");
        Thread.sleep(2000);

        driver.close();
        driver.quit();

    }
}