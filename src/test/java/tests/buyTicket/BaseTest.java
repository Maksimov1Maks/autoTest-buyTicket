package tests.buyTicket;

import base.AviaSalesPage;
import base.Base;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import static base.Config.getBrowserQuit;

public class BaseTest {

    protected WebDriver driver = Base.createDriver();
    protected Base base = new Base(driver);
    protected AviaSalesPage aviaSalesPage = new AviaSalesPage(driver);

    @AfterTest
    public void close() {
        if(getBrowserQuit()) {
            driver.quit();
        }
    }
}
