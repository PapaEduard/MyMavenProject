package technostudyB7.day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import technostudyB7.Utilities.UtilityClass;

public class getClassValue extends UtilityClass {
    public static void main(String[] args) {
        driver.get("https://www.snapdeal.com");
        WebElement searchInput = driver.findElement(By.id("inputValEnter"));
        searchInput.getAttribute("autocomplete");
        System.out.println("getAttribute(autocomplete) - "+searchInput.getAttribute("autocomplete"));
        searchInput.getAttribute("name");
        System.out.println(searchInput.getAttribute("name"));
        searchInput.getAttribute("type");
        System.out.println(searchInput.getAttribute("type"));
        searchInput.getAttribute("id");
        System.out.println(searchInput.getAttribute("id"));
        searchInput.getAttribute("class");
        System.out.println(searchInput.getAttribute("class"));


        searchInput.getCssValue("background");
        System.out.println(searchInput.getCssValue("background"));
        searchInput.getCssValue("font-family");
        System.out.println(searchInput.getCssValue("font-family"));
        searchInput.getCssValue("border-radius");
        System.out.println(searchInput.getCssValue("border-radius"));
        searchInput.getCssValue("color");
        System.out.println(searchInput.getCssValue("color"));



    }
}
