package pom_classes.Tehnomedia;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class TehnomediaHomePage {
    WebDriver driver;
    public TehnomediaHomePage(WebDriver driver){
        this.driver=driver;
    }
    protected By searchBox=By.cssSelector(".col-xs-12.col-sm-9.col-md-9>form>input");
    protected By cookie=By.cssSelector(".grt-cookie.grt-cookie-active>span");

    public void searchForItem(String data){
        driver.findElement(cookie).click();
        driver.findElement(searchBox).sendKeys(data, Keys.ENTER);
    }

}
