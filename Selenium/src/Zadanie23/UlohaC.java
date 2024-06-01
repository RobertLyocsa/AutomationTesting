package Zadanie23;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UlohaC {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/");

        driver.findElement(By.linkText("Add/Remove Elements")).click();

        driver.findElement(By.cssSelector("#content > div > button")).click();
        driver.findElement(By.cssSelector("#content > div > button")).click();
        driver.findElement(By.cssSelector("#content > div > button")).click();
        driver.findElement(By.cssSelector("#content > div > button")).click();
        driver.findElement(By.cssSelector("#content > div > button")).click();

        driver.findElement(By.cssSelector("#content > div > button")).click();
        driver.findElement(By.cssSelector("#content > div > button")).click();
        driver.findElement(By.cssSelector("#content > div > button")).click();
        driver.findElement(By.cssSelector("#content > div > button")).click();
        driver.findElement(By.cssSelector("#content > div > button")).click();

        driver.findElement(By.cssSelector("#content > div > button")).click();


        driver.findElement(By.cssSelector("#elements > button:nth-child(1)")).click();
        driver.findElement(By.cssSelector("#elements > button:nth-child(1)")).click();
        driver.findElement(By.cssSelector("#elements > button:nth-child(1)")).click();

        driver.findElement(By.cssSelector("#elements > button:nth-child(1)")).click();
        driver.findElement(By.cssSelector("#elements > button:nth-child(1)")).click();
        driver.findElement(By.cssSelector("#elements > button:nth-child(1)")).click();



        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.close();
        driver.quit();
    }
}