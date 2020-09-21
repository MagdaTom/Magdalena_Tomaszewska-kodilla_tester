package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Optional;
import java.util.Random;

public class PO_GoogleResults extends AbstractPage {

    private int drawnLinkIndex;

    @FindBy(css = "div[class='g']")
    private List<WebElement> results;

    public PO_GoogleResults(WebDriver driver) {
        super(driver, "");
        PageFactory.initElements(this.driver, this);
    }

    public List<WebElement> getResults() {
        return results;
    }

    public String getDrawnLink() {
        PageFactory.initElements(driver, PO_GoogleResults.class);
        Random random = new Random();
        drawnLinkIndex = random.nextInt(results.size());
        System.out.println("Index: " + drawnLinkIndex);
        System.out.println(results.get(drawnLinkIndex).findElement(By.cssSelector("a[href*='http']")).getAttribute("href"));
        return results.get(drawnLinkIndex).findElement(By.cssSelector("a[href*='http']")).getAttribute("href");
    }

    public void clickDrawnLink() {
        Optional.ofNullable(results.get(drawnLinkIndex)).get().click();
    }

    public void clickLink0() {
        results.get(0).click();
    }

    public void waitTilElementIsEnabled(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(results.get(drawnLinkIndex))).isEnabled();
    }
}
