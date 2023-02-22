package technostudyB7.dau6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class xpathLocaition {
    public static void main(String[] args) {
        /**tagName[atribute = 'value']-> cssSelector
         *
        //tagName[@atribute = 'value']-> relative XPATH absolute */


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.worldometers.info/world-population/");

        WebElement worldPopulationTitle = driver.findElement(By.xpath("//div[@id='maincounter-wrap']//h1"));
        System.out.println(worldPopulationTitle.getText());
        WebElement worldPopulationNumber = driver.findElement(By.xpath("//*[@id='maincounter-wrap']/div"));
        System.out.println(worldPopulationNumber.getText());






        driver.quit();

    }
}
