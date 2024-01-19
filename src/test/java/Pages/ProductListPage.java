package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class ProductListPage {
    WebDriver driver;

    By firstItem = By.id("div[data-cel-widget='search_result_2']");
    By firstItemName = By.xpath("//*[@id='search']/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span");
    By colourPatterButtonOfFirstItem = By.xpath("//*[@id='search']/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[2]/div/div/div[3]/div[1]/div/div[3]/div/div/a/u");

    public ProductListPage(WebDriver driver){

        this.driver = driver;
    }
    public String getFirstItemName(){
        return driver.findElement(firstItemName).getText();
    }
    public boolean isColorButtonPresent(){
        try {
            driver.findElement(colourPatterButtonOfFirstItem);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public void clickColorPatterButton(){
        driver.findElement(colourPatterButtonOfFirstItem).click();
    }

    public String getTitle(){
        return driver.getTitle();
    }
    public void clickOnFirstItem(){
        driver.findElement(firstItem).click();
    }
}
