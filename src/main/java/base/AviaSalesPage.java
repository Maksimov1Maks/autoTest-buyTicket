package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AviaSalesPage extends Base{

    public AviaSalesPage(WebDriver driver) {
        super(driver);
    }

    private By origin = By.xpath("//input[@id = 'origin']");
    private By destination = By.xpath("//input[@id = 'destination']");
    private By upload = By.xpath("//ul[@class='DceKnom8KjnDmQ0aAX1y']");
    private By clickTripDuration = By.xpath("//div[@class='trip-duration__field --departure']");
    private By departureDate = By.xpath("//div[normalize-space(text())='8']");
    private By month = By.xpath("//select[contains(@class,'calendar-caption__select')]");
    private By arrivalDate = By.xpath("//div[normalize-space(text())='5']");
    private By loadSection = By.xpath("//section[@class='eTCrx8Pmb7o5HhCELvNr']");
    private By checkBoxTvil = By.xpath("//label[normalize-space(.)='Открыть Tvil.ru в новой вкладке']");
    private By checkBoxOstrovok = By.xpath("//label[normalize-space(.)='Открыть Ostrovok.ru в новой вкладке']");
    private By passengersField = By.xpath("//div[contains(@class,'additional-fields --avia')]");
    private By passengerControl = By.xpath("//div[@data-test-id='passengers-adults-field']//a[@class='additional-fields__passenger-control --increment']");
    private By tripClass = By.xpath("//div[normalize-space(text())='Бизнес']");
    private By buttonTicketsFind = By.xpath("//button[normalize-space(.)='Найти билеты']");
    private By productList = By.xpath("//div[@class='product product-list']");
    private By cheapTicket = By.xpath("(//div[@data-test-id='ticket-desktop'])[1]");

    public void clearInputOrigin() {
        driver.findElement(origin).clear();
    }

    public void inputOrigin(String orig) {
        driver.findElement(origin).sendKeys(orig);
    }

    public void inputDestination(String dest) {
        driver.findElement(destination).sendKeys(dest);
    }

    public void uploadPage() {
        waitElementToBeClickable(driver.findElement(upload));
    }

    public void setClickTripDuration() {
        driver.findElement(clickTripDuration).click();
    }

    public WebElement setMonth() {
        return driver.findElement(month);
    }

    public void setMonths(WebElement element,String month) {
        new Select(element).selectByVisibleText(month);
    }

    public void setDepartureDate() {
        waitElementToBeClickable(driver.findElement(departureDate)).click();
    }

    public void setArrivalDate() {
        waitElementToBeClickable(driver.findElement(arrivalDate)).click();
    }

    public void setLoadSection() {
        waitElementToBeClickable(driver.findElement(loadSection));
    }

    public void setCheckBoxOstrovok() {
        waitElementToBeClickable(driver.findElement(checkBoxOstrovok)).click();
    }

    public void setPassengersField() {
        driver.findElement(passengersField).click();
    }

    public void setPassengerControl() {
        driver.findElement(passengerControl).click();
    }

    public void setTripClass() {
        driver.findElement(tripClass).click();
    }

    public void setButtonTicketsFind() {
        driver.findElement(buttonTicketsFind).click();
    }

    public void setProductList() {
        visibilityOfAllElements(driver.findElements(productList));
    }

    public void showCheapTicket() {
        visibilityOfAllElements(driver.findElements(cheapTicket));
        System.out.println(driver.findElement(cheapTicket).getText());
    }
}
