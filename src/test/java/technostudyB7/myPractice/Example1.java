package technostudyB7.myPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.concurrent.TimeUnit;

public class Example1 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://demo.seleniumeasy.com/table-pagination-demo.html");
        WebElement table = driver.findElement(By.className("table-responsive"));
       WebElement set1 = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[2]"));
       set1.sendKeys("AAA");
//#myTable > tr:nth-child(1) > td:nth-child(2)
// /html/body/div[2]/div/div[2]/section/div/table/tbody/tr[1]/td[2]

    }
}
