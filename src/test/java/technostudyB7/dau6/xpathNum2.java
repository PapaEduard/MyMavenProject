package technostudyB7.dau6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class xpathNum2 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(" https://www.saucedemo.com/");


        WebElement userName = driver.findElement(By.xpath("//*[@id='user-name']"));
userName.sendKeys("standard_user");
        WebElement password = driver.findElement(By.xpath("//*[@id='password']"));
password.sendKeys("secret_sauce");
WebElement loginButton = driver.findElement(By.xpath("//*[@id='login-button']"));
loginButton.click();
        System.out.println(driver.getTitle());
if (driver.getTitle().equals("Swag Labs")){
    System.out.println("test is passed");

}else {
    System.out.println("test is failed");
}
     WebElement product1 = driver.findElement(By.className("inventory_item_name"));
     product1.click();

     WebElement addToCard = driver.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-backpack']"));
addToCard.click();

driver.navigate().back();

   WebElement product2 = driver.findElement(By.xpath("//*[@id='item_5_title_link']/div"));
   product2.click();

   WebElement addButton2 = driver.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-fleece-jacket']"));
   addButton2.click();

        driver.navigate().back();

        WebElement product3 = driver.findElement(By.xpath("//*[@id='item_1_title_link']/div"));
        product3.click();
        WebElement addToCart3 = driver.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-bolt-t-shirt']"));
        addToCart3.click();

        driver.navigate().back();

        WebElement cart = driver.findElement(By.xpath("//*[@id='shopping_cart_container']"));
        cart.click();

        WebElement checkout = driver.findElement(By.xpath("//*[@id='checkout']"));
        checkout.click();

        WebElement firstName = driver.findElement(By.xpath("//*[@id='first-name']"));
        firstName.sendKeys("John");
        WebElement lastName = driver.findElement(By.xpath("//*[@id='last-name']"));
        lastName.sendKeys("Michels");
        WebElement zipcod = driver.findElement(By.xpath("//*[@id='postal-code']"));
        zipcod.sendKeys("27106");

        WebElement continueButton = driver.findElement(By.xpath("//input[@type='submit']"));
        continueButton.click();

        WebElement checkProd1 = driver.findElement(By.xpath("//*[@id='item_4_title_link']/div"));
        WebElement checkProd2 = driver.findElement(By.xpath("//*[@id='item_5_title_link']/div"));
        WebElement checkProd3 = driver.findElement(By.xpath("//*[@id='item_1_title_link']/div"));
        List<String> checking = new ArrayList<>();
        checking.add(checkProd1.getText());
        checking.add(checkProd2.getText());
        checking.add(checkProd3.getText());
        System.out.println(checking.contains(product1.getText()));
        System.out.println(checking.contains(product2.getText()));
        System.out.println(checking.contains(product3.getText()));


        driver.quit();


        /**1- Go to https://www.saucedemo.com/
         2- login with valid credentials /done
         3- Click on Sauce Labs Backpack and add to the cart
         4- Click on Back To Products
         5- Click on Sauce Labs Bolt T-Shirt and add to the cart
         6- Click on the cart
         7- Click on the Check Out button
         8- Fill the form and click on Continue
         9- Check if you see your products*/
    }
}
