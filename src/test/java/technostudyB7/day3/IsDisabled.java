package technostudyB7.day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisabled {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        //<button autocomplete="off" type="button" onclick="swapInput()">Disable</button>
        WebElement enableButton = driver.findElement(By.cssSelector("#input-example>button"));
        WebElement inputFile = driver.findElement(By.cssSelector("#input-example>input"));

       boolean isItFiled = inputFile.isEnabled();
        System.out.println(isItFiled);

        enableButton.click();
        Thread.sleep(10000);

        boolean isItFiled2 =  inputFile.isEnabled();
        System.out.println(isItFiled2);

    }
}
