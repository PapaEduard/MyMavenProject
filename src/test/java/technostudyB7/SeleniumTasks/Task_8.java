package technostudyB7.SeleniumTasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_8 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("http://zero.webappsecurity.com/login.html");

        String expectedHeader = "Log in to ZeroBank";

        String actualHeader = driver.findElement(By.tagName("h3")).getText();

        if (expectedHeader.equals(actualHeader)){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }

    }
}
