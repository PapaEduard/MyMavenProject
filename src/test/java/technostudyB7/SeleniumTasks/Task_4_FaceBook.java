package technostudyB7.SeleniumTasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_4_FaceBook {
    public static void main(String[] args) throws InterruptedException {
        /*TC #4: Facebook "create a page" link verification
        1. Open Chrome browser
        2. Go to https://www.facebook.com
        3. Verify “Create a page” link href value contains text: Expected: “registration_form”*/
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
        //<a href="/pages/create/?ref_type=registration_form" class="_8esh">Create a Page</a>
        String actualHrefText=driver.findElement(By.className("_8esh")).getAttribute("href");
        String expectedText="registration_form";
        if(actualHrefText.contains(expectedText)){
            System.out.println("PASSED");
        }else{
            System.out.println("FAILED");
        }
        Thread.sleep(5000);
        driver.quit();
    }
}
