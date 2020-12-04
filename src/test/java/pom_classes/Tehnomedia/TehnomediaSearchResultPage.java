package pom_classes.Tehnomedia;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class TehnomediaSearchResultPage {
    WebDriver driver;
    public TehnomediaSearchResultPage(WebDriver driver){
        this.driver=driver;
    }

    protected By priceItemOne= By.cssSelector("#products_container.table_layout>div>div>.product_item .description>div>p>b:nth-child(1)");
    protected By itemOne=By.cssSelector("#products_container .product_item:nth-child(1) .description:nth-child(2)>a:nth-child(2)");
    public String getItemPrice(){
        return driver.findElement(priceItemOne).getText();
    }
    public void selectItem(){
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.PAGE_DOWN);
        driver.findElement(itemOne).click();
    }
}
