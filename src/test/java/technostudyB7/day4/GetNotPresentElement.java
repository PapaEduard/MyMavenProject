package technostudyB7.day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetNotPresentElement {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://the-internet.herokuapp.com/dynamic_loading/2");
        //<button>Start</button>
        WebElement startButton = driver.findElement(By.cssSelector("#start>button"));
        startButton.click();
        Thread.sleep(10000);
        //<h4>Hello World!</h4>
        WebElement hiddenText = driver.findElement(By.cssSelector("#finish>h4"));
        String result = hiddenText.getText();
        System.out.println(result);
       // String checkingText = "Hello Wold!";
        //boolean report = text.equals(checkingText);
       // System.out.println(report);



        driver.quit();
    }
}
