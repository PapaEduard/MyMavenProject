package technostudyB7_day1.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MoreNavigations {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.seleniumeasy.com/");
        System.out.println( driver.getTitle());
        String expectedTitle = "Selenium Easy - Best Demo website to practice Selenium Webdriver Online";
        String actualTitle = driver.getTitle();

        if(expectedTitle.equals(actualTitle)){
            System.out.println("verification is clear : PASS");
            System.out.println(actualTitle);
        }else {
            System.out.println("verification is failed : FAIL");
            System.out.println(actualTitle);
        }
             Thread.sleep(3000);
        String teslaURL = "https://www.tesla.com/";
        driver.navigate().to("https://www.tesla.com/");
        driver.manage().window().maximize();

        driver.close();
        driver.quit();
    }
}
