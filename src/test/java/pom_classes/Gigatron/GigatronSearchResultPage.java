package pom_classes.Gigatron;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class GigatronSearchResultPage {
    WebDriver driver;
    public GigatronSearchResultPage(WebDriver driver){
        this.driver=driver;
    }

    protected By check=By.cssSelector(".col.col-12 .control-bar>h1");
    protected By priceItemOne=By.cssSelector("#grid-products>div:nth-child(1)>div>div>div:nth-child(3)>div:nth-child(3)>div>div:nth-child(3)");
    protected By itemOne=By.cssSelector("#grid-products>div:nth-child(1)>div>div>div:nth-child(3)>div>div:nth-child(2)>a");

    public String getCheckTX(){
        return driver.findElement(check).getText();
    }

    public void checkPage(String checkTX){
        Assert.assertEquals(driver.findElement(check).getText(),checkTX);
    }

    public String getItemPrice(){
        return driver.findElement(priceItemOne).getText();
    }

    public void selectItem(){
        driver.findElement(itemOne).click();
    }




}
