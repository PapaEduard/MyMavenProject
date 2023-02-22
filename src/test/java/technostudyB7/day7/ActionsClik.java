package technostudyB7.day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;
import technostudyB7.Utilities.UtilityClass;

import javax.swing.*;

public class ActionsClik extends UtilityClass {
    public static void main(String[] args) {
        driver.get("https://demoqa.com/buttons");
        WebElement doubleClick = driver.findElement(By.id("doubleClickBtn"));
        Actions actions = new Actions(driver);
        Action doubleClickA = actions.doubleClick(doubleClick).build();
        doubleClickA.perform();


       // rightClickBtn
        WebElement rightClickBtn = driver.findElement(By.id("rightClickBtn"));
        Action rightClickAct = actions.contextClick(rightClickBtn).build();
        rightClickAct.perform();

       //8Q77O
       WebElement click = driver.findElement(By.xpath("//button[text()='Click Me']"));
        Action clickAct = actions.click(click).build();
       clickAct.perform();


        Action doubleClickA2 = actions.moveToElement(doubleClick).doubleClick().build();
        doubleClickA2.perform();
        Action  rightClickAct2 = actions.moveToElement(rightClickBtn).contextClick().build();
        rightClickAct2.perform();
        Action clickAct2 = actions.moveToElement(click).click().build();
       clickAct2.perform();

    }
}
