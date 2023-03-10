package technostudyB7.day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThreadCatch {
    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://the-internet.herokuapp.com/dynamic_loading/2");
        //<button>Start</button>
        WebElement startButton = driver.findElement(By.cssSelector("#start>button"));
        startButton.click();
        String text = "";
        while (text.equals("")){
            try{
                WebElement hiddenText = driver.findElement(By.cssSelector("#finish>h4"));
                text = hiddenText.getText();
            }
            catch (NoSuchElementException ex){
                System.out.println("try to find");
            }
        }

        System.out.println(text);
    }
}