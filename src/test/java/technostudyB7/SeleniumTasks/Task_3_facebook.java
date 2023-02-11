package technostudyB7.SeleniumTasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_3_facebook {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
        //TIPS FOR TASK #3:
        //1. Set up driver
        //2. Open browser
        //3. Get webpage: https://www.facebook.com
        //4. Locate header, get the text and store it in actualHeader
        //String
        //5. Create expectedHeader String
        //6. Create if conditions to do your verification


        //<h2 class="_8eso">Connect with friends and the world around you on Facebook.</h2>
        WebElement text = driver.findElement(By.className("_8eso"));
        String actualText = text.getText();
        String exeptedText = "Connect with friends and the world around you on Facebook.";
        if (actualText.equals(exeptedText)){
            System.out.println("test pass: "+true);

        }else {
            System.out.println("test pass: "+false);
        }




    }
}
