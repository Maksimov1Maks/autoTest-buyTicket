package tests.buyTicket;

import base.Config;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static base.Config.getImplicitWait;

public class BuyTicket extends BaseTest {

    @BeforeTest
    public void setUp() {
        driver.manage().timeouts().implicitlyWait(getImplicitWait());
    }

    @Test
    public void buyTicket() {
        base.openPage(Config.getUrl());
        aviaSalesPage.clearInputOrigin();
        aviaSalesPage.inputOrigin("Санкт-Петербург");
        aviaSalesPage.inputDestination("Казань");
        aviaSalesPage.uploadPage();
        aviaSalesPage.setCheckBoxOstrovok();
        aviaSalesPage.setClickTripDuration();
        aviaSalesPage.setMonths(aviaSalesPage.setMonth(),"Сентябрь");
        aviaSalesPage.setDepartureDate();
        aviaSalesPage.setMonths(aviaSalesPage.setMonth(),"Октябрь");
        aviaSalesPage.setArrivalDate();
        aviaSalesPage.setLoadSection();
        aviaSalesPage.setPassengersField();
        aviaSalesPage.setPassengerControl();
        aviaSalesPage.setTripClass();
        aviaSalesPage.setButtonTicketsFind();
        aviaSalesPage.setProductList();
        aviaSalesPage.showCheapTicket();
    }
}
