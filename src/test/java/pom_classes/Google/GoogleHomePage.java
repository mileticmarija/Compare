package pom_classes.Google;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.security.Key;

public class GoogleHomePage {
    WebDriver driver;
    public GoogleHomePage(WebDriver driver){
        this.driver=driver;
    }

    protected By searchBox= By.name("q");

    public void search(String searchSite){
        driver.findElement(searchBox).sendKeys(searchSite, Keys.ENTER);
    }

}
