package technostudyB7.day5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class DropDownMenu {
    /**
     * <select class="form-control" id="select-demo">
     * //				<option value="" selected="" disabled="">Please select</option>
     * //				 <option value="Sunday">Sunday</option>
     * //				  <option value="Monday">Monday</option>
     * //				  <option value="Tuesday">Tuesday</option>
     * //				  <option value="Wednesday">Wednesday</option>
     * //				  <option value="Thursday">Thursday</option>
     * //				  <option value="Friday">Friday</option>
     * //				  <option value="Saturday">Saturday</option>
     * //			  </select>
     */
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");

        WebElement dropDownMenu = driver.findElement(By.id("select-demo"));
        Select select = new Select(dropDownMenu);
        select.selectByIndex(1);
        select.selectByIndex(3);
        select.selectByValue("Friday");
        select.selectByVisibleText("Saturday");
        String option = select.getFirstSelectedOption().getText();
        String expected = "Saturday";
        if (option.equals(expected)) {
            System.out.println(true);
        } else {
            System.out.println(false);


            /***<select size="10" name="States" multiple="multiple" id="multi-select" style="width:200px">
             <option value="California">California</option>
             <option value="Florida">Florida</option>
             <option value="New Jersey">New Jersey</option>
             <option value="New York">New York</option>
             <option value="Ohio">Ohio</option>
             <option value="Texas">Texas</option>
             <option value="Pennsylvania">Pennsylvania</option>
             <option value="Washington">Washington</option>
             </select>*/

            WebElement multiSelect = driver.findElement(By.id("multi-select"));
            Select select1 = new Select(multiSelect);
            select1.selectByIndex(0);
            select1.selectByIndex(1);
            select1.selectByIndex(2);
            select1.selectByIndex(3);
            select1.selectByIndex(4);
            select1.selectByValue("Texas");
            select1.selectByValue("Pennsylvania");
            select1.selectByVisibleText("Washington");

            /**<button type="button" value="Print All" id="printAll" class="btn btn-primary">Get All Selected</button>*/
            WebElement buttonSelect = driver.findElement(By.id("printAll"));

        }
    }
}