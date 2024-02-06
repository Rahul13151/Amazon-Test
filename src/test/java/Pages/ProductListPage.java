package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class ProductListPage {
    WebDriver driver;

    By firstItem = By.id("div[data-cel-widget='search_result_2']");
    By firstItemName = By.xpath("(//*[@id='search']//h2//span)[1]");
    By colourPatterButtonOfFirstItem = By.xpath("(//*[@id='search']//div[@class='puisg-col-inner']//div[@class='puisg-row']//u)[1]");

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
