package technostudyB7.day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import technostudyB7.Utilities.UtilityClass;

public class DragAndDropActions extends UtilityClass {
    public static void main(String[] args) {

        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        WebElement wash = driver.findElement(By.id("box3"));
        System.out.println(wash.getCssValue("background-color"));
        WebElement USA = driver.findElement(By.id("box103"));

        Actions actions = new Actions(driver);
        Action drsgAndDrop = actions.dragAndDrop(wash,USA).build();
         drsgAndDrop.perform();

        System.out.println(wash.getCssValue("background-color"));

        WebElement copenh = driver.findElement(By.id("box4"));

        WebElement Denmark = driver.findElement(By.id("box104"));
        Action DragonDropCopen =actions.dragAndDrop(copenh,Denmark).build();
        DragonDropCopen.perform();
    }
}
