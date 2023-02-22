package technostudyB7.day8;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import technostudyB7.Utilities.UtilityClass;

public class ErrorKeysAction extends UtilityClass {
    public static void main(String[] args) {
        driver.get("https://demoqa.com/auto-complete");
        WebElement inputBox = driver.findElement(By.xpath("//*[@id='autoCompleteMultipleContainer']/div/div[1]"));

        Actions actions=new Actions(driver);
        Action arroeKeys = actions.moveToElement(inputBox).click().sendKeys("b").build();
        arroeKeys.perform();

        Action act=actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build();
        act.perform();

        quitDriver(3);
    }
}
