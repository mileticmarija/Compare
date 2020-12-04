package pom_classes.Gigatron;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GigatronItemOnePage {
    WebDriver driver;
    public GigatronItemOnePage(WebDriver driver){
        this.driver=driver;
    }

    protected By ramMem=By.cssSelector(".col.col-8>div>ul>li:nth-child(3)");
    protected By internaMem=By.cssSelector(".col.col-8>div>ul>li:nth-child(4)");
    protected By zadnjaKam=By.cssSelector(".col.col-8>div>ul>li:nth-child(5)");
    protected By cena=By.cssSelector(".price-holder:nth-child(2)>div:nth-child(3)");

    public String[] getTX(){
        return new String[] {driver.findElement(ramMem).getText(),driver.findElement(internaMem).getText(),driver.findElement(zadnjaKam).getText(),driver.findElement(cena).getText()};
    }

}
