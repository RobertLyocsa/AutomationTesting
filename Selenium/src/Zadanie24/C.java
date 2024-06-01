package Zadanie24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        Thread.sleep(3000);

        driver.manage().window().maximize();

        driver.get("https://www.automationtesting.co.uk/");

        driver.findElement(By.cssSelector("body")).click();

        driver.findElement(By.cssSelector("#menu > ul > li:nth-child(6) > a")).click();
        Thread.sleep(1000);

        WebElement resultElement = driver.findElement(By.cssSelector("#result"));


        resultElement.clear();
        resultElement.sendKeys("40+4");

        driver.findElement(By.cssSelector(":nth-child(5) > td:nth-child(3) > input[type=button]")).click();

        Thread.sleep(1000);

        String actualResult = resultElement.getAttribute("value");

        String expectedResult = "44";

        if (actualResult.equals(expectedResult)) {
            System.out.println("Výsledok je správny: " + actualResult);
        } else {
            System.out.println("Výsledok nie je správny. Očakávali sme: " + expectedResult + ", ale získali sme: " + actualResult);
        }

        Thread.sleep(1000);

        resultElement.clear(); // tu som sa naucil ze sendKeys nema zabudovanu clear funkcionalitu
        resultElement.sendKeys("40*4");

        driver.findElement(By.cssSelector(":nth-child(5) > td:nth-child(3) > input[type=button]")).click();

        Thread.sleep(1000);

        String actualResult3 = resultElement.getAttribute("value");

        String expectedResult3 = "160";

        if (actualResult3.equals(expectedResult3)) {
            System.out.println("Výsledok je správny: " + actualResult3);
        } else {
            System.out.println("Výsledok nie je správny. Očakávali sme: " + expectedResult3 + ", ale získali sme: " + actualResult3);
        }

        Thread.sleep(1000);

        resultElement.clear();
        resultElement.sendKeys("40-4");

        driver.findElement(By.cssSelector(":nth-child(5) > td:nth-child(3) > input[type=button]")).click();

        Thread.sleep(1000);

        String actualResult2 = resultElement.getAttribute("value");

        String expectedResult2 = "36";

        if (actualResult2.equals(expectedResult2)) {
            System.out.println("Výsledok je správny: " + actualResult2);
        } else {
            System.out.println("Výsledok nie je správny. Očakávali sme: " + expectedResult2 + ", ale získali sme: " + actualResult2);
        }

        Thread.sleep(3000);


        driver.close();
        driver.quit();

    }
}