package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PO_RandomGoogleResult extends AbstractPage {


    PO_GoogleResults googleResults;

    public PO_RandomGoogleResult(WebDriver driver) {
        super(driver, "");
        this.googleResults = new PO_GoogleResults(driver);
        PageFactory.initElements(this.driver, this);
    }

    public String getUrl() {
        System.out.println(driver.getCurrentUrl());
        return driver.getCurrentUrl();
    }
}

