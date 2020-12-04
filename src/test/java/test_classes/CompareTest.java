package test_classes;

import Support.CompareMethodClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pom_classes.Gigatron.GigatronHomePage;
import pom_classes.Gigatron.GigatronItemOnePage;
import pom_classes.Gigatron.GigatronSearchResultPage;
import pom_classes.Google.GoogleHomePage;
import pom_classes.Google.GoogleResultPage;
import pom_classes.Tehnomedia.TehnomediaHomePage;
import pom_classes.Tehnomedia.TehnomediaItemOnePage;
import pom_classes.Tehnomedia.TehnomediaSearchResultPage;
import selenium_core.DriverManager;
import selenium_core.DriverManagerFactory;

import java.util.concurrent.TimeUnit;

public class CompareTest extends CompareMethodClass {
    WebDriver driver;
    String URL="https://google.com";
    DriverManager driverManager;
    GoogleHomePage ghp;
    GoogleResultPage grp;
    GigatronHomePage gigaHP;
    GigatronSearchResultPage gigaSRP;
    GigatronItemOnePage gIOP;
    TehnomediaHomePage tHP;
    TehnomediaSearchResultPage tSRP;
    TehnomediaItemOnePage tIOP;


    @BeforeMethod
    @Parameters({"browser"})
    public void setup(String browser){
        driverManager= DriverManagerFactory.getDriverManager(browser);
        driver=driverManager.qetWebDriver();
        driver.get(URL);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void compareFirstTwoItems(){
        ghp=new GoogleHomePage(driver);
        ghp.search("gigatron");

        grp=new GoogleResultPage(driver);
        grp.enterSite();

        gigaHP=new GigatronHomePage(driver);
        gigaHP.searchForItem("motorola");

        gigaSRP=new GigatronSearchResultPage(driver);
        gigaSRP.selectItem();

        gIOP=new GigatronItemOnePage(driver);

      String itemOneData []=gIOP.getTX();


        driver.navigate().to(URL);
        ghp.search("tehnomedia");
        grp.enterSite();

        tHP=new TehnomediaHomePage(driver);
        tHP.searchForItem("motorola");

        tSRP=new TehnomediaSearchResultPage(driver);
        tSRP.selectItem();

        tIOP=new TehnomediaItemOnePage(driver);
        String itemTwoData[]=tIOP.getTX();

        //compare(itemOneData[0],itemTwoData[0],itemOneData[1],itemTwoData[1],itemOneData[2],itemTwoData[2],itemOneData[3],itemTwoData[3]);
        compare1(itemOneData[0],"RAM",itemTwoData[0],"RAM");
    }

    @AfterMethod
    public void tearDown(){
        driverManager.quitDriver();
    }
}
