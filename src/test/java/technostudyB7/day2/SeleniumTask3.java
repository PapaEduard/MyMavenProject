package technostudyB7.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTask3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
        Thread.sleep(2000);
        WebElement checkBox = driver.findElement(By.id("isAgeSelected"));
        checkBox.click();
        WebElement checkBoxText = driver.findElement(By.id("txtAge"));

        System.out.println(checkBoxText.getText());
        if (checkBoxText.getText().equals("Success - Check box is checked")){
            System.out.println("test is : PASSED");

        }else {
            System.out.println("test is : FAILED");
        }
        WebElement clickAll = driver.findElement(By.id("check1"));
        clickAll.click();
        System.out.println(clickAll.getAttribute("value"));

        if (clickAll.getAttribute("value").equals("Uncheck All")){
            System.out.println("second test is : PASSED");
        }else {
            System.out.println("second test is : FAILED");
        }

        clickAll.click();
        System.out.println(clickAll.getAttribute("value"));
        if (clickAll.getAttribute("value").equals("Check All")){
            System.out.println("test 3 is :PASSED");
        }else {
            System.out.println("test 3 is : FAILED");
        }


    }
}
