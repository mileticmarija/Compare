package pom_classes.Google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleResultPage {
    WebDriver driver;
    public GoogleResultPage(WebDriver driver){
        this.driver=driver;
    }
    protected By searchResultOne= By.cssSelector("#rso :nth-child(2)>div>div>div>a>h3>span");

    public void enterSite(){
        driver.findElement(searchResultOne).click();
    }
}
