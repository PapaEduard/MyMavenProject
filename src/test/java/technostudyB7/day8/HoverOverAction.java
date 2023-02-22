package technostudyB7.day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import technostudyB7.Utilities.UtilityClass;


import java.time.Duration;

public class HoverOverAction extends UtilityClass {
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://www.etsy.com/");
        //catnav-primary-link-10855

        WebElement element1 = driver.findElement(By.id("catnav-primary-link-10855"));
        Actions actions = new Actions(driver);
        Action hoverOverJewelery = actions.moveToElement(element1).build();
        hoverOverJewelery.perform();

        WebElement element2 = driver.findElement(By.id("side-nav-category-link-10896"));

        Action hoverOverJewelery1 = actions.moveToElement(element2).build();
        hoverOverJewelery1.perform();
    }
}
