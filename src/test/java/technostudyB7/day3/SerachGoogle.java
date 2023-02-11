package technostudyB7.day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SerachGoogle {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        //<input class="gLFyf" jsaction="paste:puy29d;"
        // maxlength="2048" name="q" type="text" aria-autocomplete="both"
        // aria-haspopup="false" autocapitalize="off" autocomplete="off"
        // autocorrect="off" autofocus="" role="combobox" spellcheck="false"
        // title="Search" value="" aria-label="Search" data-ved="0ahUKEwjO3t2U64j
        // 9AhU4F1kFHc-vBXoQ39UDCAY">
        String input = "bamboo pen";
       WebElement searchBox = driver.findElement(By.name("q"));
       searchBox.sendKeys(input+ Keys.ENTER);
      // searchBox.click();
        String actualTitle = driver.getTitle();
        String expectedTitle = "bamboo pen - Google Search";
        if (actualTitle.equals(expectedTitle)){
            System.out.println("test is : Passed "+true);

        }else {
            System.out.println(false);
        }
        System.out.println(actualTitle);


    }
}
