package Pages;

import org.openqa.selenium.WebDriver;

public class SignUpPage {
    WebDriver driver;
    public SignUpPage(WebDriver driver){
        this.driver=driver;
    }
    public String getTitle(){
        return driver.getTitle();
    }
}
