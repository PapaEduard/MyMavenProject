package technostudyB7.day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import technostudyB7.Utilities.UtilityClass;

public class ActionsDragAndDropBy extends UtilityClass {
    public static void main(String[] args) throws InterruptedException {
        driver.get("http://talkerscode.com/webtricks/demo/demo_price-range-slider-using-jquery-css-and-php.php");
        // (//span[@class='ui-slider-handle ui-state-default ui-corner-all'])[2]
        WebElement rithScrol = driver.findElement(By.xpath("(//span[@class='ui-slider-handle ui-state-default ui-corner-all'])[2]"));
        Actions actions = new Actions(driver);
        Thread.sleep(3000);
        Action scrolAct = actions.dragAndDropBy(rithScrol,100,0).build();
        scrolAct.perform();
        Thread.sleep(3000);
        Action scrolAct2 = actions.dragAndDropBy(rithScrol,-100,0).build();
        scrolAct2.perform();
    }
}
