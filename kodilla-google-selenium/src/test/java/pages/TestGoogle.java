package pages;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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
        List<String> results = googleSearch.searchResults();
        Assert.assertNotNull(results);
        Assert.assertThat(results, hasSize(6));
    }

    @Test
    public void shouldClickTheDrawnLink() {
        googleSearch.searchResults();
        googleResults.clickRandomLink();
        String link = googleResults.getDrawnLink();
        randomGoogleResult = new PO_RandomGoogleResult(driver);
        Assert.assertEquals(link, randomGoogleResult.getUrl());
    }
}