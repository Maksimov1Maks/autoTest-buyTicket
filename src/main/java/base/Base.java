package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;

public class Base extends Config {

    protected static WebDriver driver;

    public Base(WebDriver driver) {
        this.driver = driver;
    }

    public static WebDriver createDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\hromdriver\\NewChrome\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(getImplicitWait());
        return driver;
    }

    public void openPage(String url) {
        driver.get(getUrl());
    }

    public WebElement waitElementToBeClickable(WebElement element) {
        new WebDriverWait(driver, getExplicitWait()).until(ExpectedConditions.elementToBeClickable(element));
        return element;
    }

    public List<WebElement> visibilityOfAllElements(List<WebElement> element) {
        new WebDriverWait(driver, getVisibilityOfAllElements()).until(ExpectedConditions.visibilityOfAllElements(element));
        return element;
             }
    }



