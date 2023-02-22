package technostudyB7.day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import technostudyB7.Utilities.UtilityClass;

import java.util.ArrayList;
import java.util.List;

public class Example extends UtilityClass {
    public static void main(String[] args) {
        /**1- Go to https://www.saucedemo.com/
         2- login with valid credentials
         3- Click on Sauce Labs Backpack and add to the cart
         4- Click on Back To Products
         5- Click on Sauce Labs Bolt T-Shirt and add to the cart
         6- Click on the cart
         7- Click on the Check Out button
         8- Fill the form and click on Continue
         9- Check if you see your products*/
        driver.get("https://www.saucedemo.com/");
        WebElement userName = driver.findElement(By.xpath("//*[@id='user-name']"));
        userName.sendKeys("standard_user");
        WebElement password = driver.findElement(By.xpath("//*[@id='password']"));
        password.sendKeys("secret_sauce");
        WebElement loginButton = driver.findElement(By.xpath("//*[@id='login-button']"));
        loginButton.click();
        List<WebElement> inventoryItems = driver.findElements(By.cssSelector(".inventory_item_name"));
        List<String> inventoryItemsNames = new ArrayList<>();


        for (int i = 0; i < 3; i++) {
            int randomIndex = (int) (Math.random() * inventoryItems.size());
            inventoryItems.get(randomIndex).click();
            inventoryItemsNames.add(inventoryItemsNames.get(randomIndex));
            System.out.println(inventoryItemsNames);
            WebElement addToCartButton = driver.findElement(By.xpath("//button[text()='Add to cart']"));
            addToCartButton.click();

            driver.navigate().back();
        }
    }
}
