package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
    WebDriver driver;
    By cartItemCount = By.id("nav-cart-count");
    By addToCartButton = By.id("add-to-cart-button");
    By proceedToCheckout = By.cssSelector("input[value='Proceed to checkout']");
    By productName = By.id("productTitle");

    public ProductPage(WebDriver driver){

        this.driver = driver;
    }
    public String getItemName(){
        return driver.findElement(productName).getText();
    }
    public String getCartSize(){
        return driver.findElement(cartItemCount).getText();
    }
    public void clickAddToCart(){
        driver.findElement(addToCartButton).click();
    }
    public void clickProceedToBuy(){
        driver.findElement(proceedToCheckout).click();
    }

}
