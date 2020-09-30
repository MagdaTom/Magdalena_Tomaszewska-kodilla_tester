package pages;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import static org.hamcrest.Matchers.hasSize;

public class TestGoogle {
    private WebDriver driver;
    private PO_GoogleSearch googleSearch;
    private PO_GoogleResults googleResults;
    private PO_RandomGoogleResult randomGoogleResult;

    @Before
    public void testSetup() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        googleSearch = new PO_GoogleSearch(driver);
        driver.manage().window().maximize();
        googleSearch.navigate();
        googleSearch.acceptAlert();
        googleResults = new PO_GoogleResults(driver);
    }

    @After
    public void tearDown() {
        driver.close();
    }

    @Test
    public void testGoogleSearchForKodilla() {
        List<String> results = googleSearch.searchResults("Kodilla");
        Assert.assertNotNull(results);
        Assert.assertThat(results, hasSize(6));

    }

    @Test
    public void shouldClickTheDrawnLink() {
        googleSearch.searchResults("Kodilla");
        String link = googleResults.getDrawnLink();
        googleResults.waitTilElementIsEnabled();
        googleResults.clickDrawnLink();
        randomGoogleResult = new PO_RandomGoogleResult(driver);
        Assert.assertEquals(link, randomGoogleResult.getUrl());
    }
}