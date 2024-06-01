package Zadanie23;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UlohaAandB {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/");

        driver.findElement(By.linkText("Checkboxes")).click();
        driver.findElement(By.cssSelector("#checkboxes > input[type=checkbox]:nth-child(1)")).click();
        driver.findElement(By.cssSelector("#checkboxes > input[type=checkbox]:nth-child(3)")).click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.close();
        driver.quit();
    }
}