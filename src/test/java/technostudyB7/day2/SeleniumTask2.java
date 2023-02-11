package technostudyB7.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTask2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");

        Thread.sleep(2000);
        WebElement sum1 = driver.findElement(By.id("sum1"));
        sum1.sendKeys(Integer.toString(500));
        WebElement sum2 = driver.findElement(By.id("sum2"));
        sum2.sendKeys(Integer.toString(1000));
        WebElement butt2 = driver.findElement(By.xpath("//button[text()='Get Total']"));
        butt2.click();
        WebElement total = driver.findElement(By.id("displayvalue"));
        int result = 1500;
        System.out.println("My check result is = " + result);
        if (total.getText().equals(Integer.toString(result))) {
            System.out.println("Test is: PASSED...");
            System.out.println("total is = " + total.getText());
        }else {
            System.out.println(" FAILED... Check again total = "+total.getText()+" must equals result = "+result);
            System.out.println("actual result is = "+result);
        }
        System.out.println(driver.getCurrentUrl());
        driver.quit();
    }
}