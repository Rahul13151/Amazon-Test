package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductListPage {
    WebDriver driver;

    By firstItem = By.id("div[data-cel-widget='search_result_2']");
    By fristItemName = By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span");
    By colourPatterButtonOfFirstItem = By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[2]/div/div/div[3]/div[1]/div/div[3]/div/div/a");

    public ProductListPage(WebDriver driver){

        this.driver = driver;
    }
    public String getfirstItemName(){
        return driver.findElement(fristItemName).getText();
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
