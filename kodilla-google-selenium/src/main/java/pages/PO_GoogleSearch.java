package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;
import java.util.stream.Collectors;

public class PO_GoogleSearch extends AbstractPage {

    @FindBy(css = "input[title='Szukaj']")
    static WebElement inputField;

    @FindBy(css = "input[value='Szukaj w Google']")
    static List<WebElement> searchButton;

    private static PO_GoogleResults googleResults;
    private static PO_RandomGoogleResult randomGoogleResult;


    public PO_GoogleSearch(WebDriver driver) {
        super(driver, "http://www.google.com");
    }

    public List<String> searchResults(String phrase) {
        PageFactory.initElements(driver, PO_GoogleSearch.class);
        inputField.sendKeys(phrase);
        googleResults = loadResults(driver);
        return googleResults.getResults().stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());
    }

    public PO_GoogleResults loadResults(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(searchButton.get(0))).click();
        PO_GoogleResults googleResults = new PO_GoogleResults(driver);
        return googleResults;
    }

    public void acceptAlert() {
        driver.switchTo().frame(0);
        WebElement agreeButton = driver.findElement(By.xpath("//*[@id=\"introAgreeButton\"]/span/span"));
        agreeButton.click();
        driver.switchTo().defaultContent();
    }
}

