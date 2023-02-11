package technostudyB7.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SeleniumTask4 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
        Thread.sleep(2000);
        WebElement radioButton1 = driver.findElement(By.name("optradio"));
        radioButton1.click();
        WebElement getCheckedValue = driver.findElement(By.id("buttoncheck"));
        getCheckedValue.click();
        WebElement value1 = driver.findElement(By.className("radiobutton"));
        System.out.println(value1.getText());
        if (value1.getText().equals("Radio button 'Male' is checked")){
            System.out.println("test is : Passed");
        }else {
            System.out.println("test is : Failed");
        }
        //<input type="radio" value="Female" name="optradio">

    }
}
