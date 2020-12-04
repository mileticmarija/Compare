package pom_classes.Tehnomedia;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TehnomediaItemOnePage {
    WebDriver driver;
    public TehnomediaItemOnePage(WebDriver driver){
        this.driver=driver;
    }

    protected By ramMem=By.cssSelector(".description_section:nth-child(4)>ul>div:nth-child(4)");
    protected By internaMem=By.cssSelector(".description_section:nth-child(4)>ul>div:nth-child(7)");
    protected By zadnjaKam=By.cssSelector(".description_section:nth-child(4)>ul>div:nth-child(2)");
    protected By cena=By.cssSelector(".product_price:nth-child(6)>b");

    public String[] getTX(){
        return new String[] {driver.findElement(ramMem).getText(),driver.findElement(internaMem).getText(),driver.findElement(zadnjaKam).getText(),driver.findElement(cena).getText()};
    }
}
