package technostudyB7.day8;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import technostudyB7.Utilities.UtilityClass;

public class SentKeysAction extends UtilityClass {
    public static void main(String[] args) {
        driver.get("https://demoqa.com/auto-complete");
        WebElement inputBox = driver.findElement(By.xpath("//*[@id='autoCompleteMultipleContainer']/div/div[1]"));

        Actions actions=new Actions(driver);
        Action useShift = actions.moveToElement(inputBox).click().keyDown(Keys.SHIFT).sendKeys("a").keyUp(Keys.SHIFT)
                .sendKeys("nna").build();
        useShift.perform();
    }
}
