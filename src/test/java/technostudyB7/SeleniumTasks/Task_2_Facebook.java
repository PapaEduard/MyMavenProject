package technostudyB7.SeleniumTasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_2_Facebook {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com");
        //<input type="text" class="inputtext _55r1 _6luy" name="email" id="email"
        // data-testid="royal_email" placeholder="Email or phone number"
        // autofocus="1" aria-label="Email or phone number">

        WebElement usernameBox =driver.findElement(By.id("email"));
        usernameBox.sendKeys("zhan3333@gmail.com");
        //<input type="password" class="inputtext _55r1 _6luy _9npi" name="pass" id="pass"
        // data-testid="royal_pass" placeholder="Password" aria-label="Password">

        WebElement passwordBox= driver.findElement(By.id("pass"));
        passwordBox.sendKeys("12345");

        //<button value="1" class="_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy" name="login"
        // data-testid="royal_login_button" type="submit" id="u_0_5_pp">Log In</button>
        WebElement loginButton= driver.findElement(By.name("login"));
        Thread.sleep(10000);
        loginButton.click();
        System.out.println( driver.getTitle());
        if(driver.getTitle().equals("Log into Facebook")){
            System.out.println( "test passed: "+true);
        }else {
            System.out.println( "test passed: "+false);
        }
        driver.quit();
    }
}
