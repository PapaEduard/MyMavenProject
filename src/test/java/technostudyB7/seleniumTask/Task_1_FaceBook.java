package technostudyB7.seleniumTask;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_1_FaceBook {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
        System.out.println(driver.getTitle());
        String title = "Facebook - log in or sign up";
        if (driver.getTitle().equals(title)){
            System.out.println(true);

        }else {
            System.out.println(false);
        }
        driver.quit();
    }
}
