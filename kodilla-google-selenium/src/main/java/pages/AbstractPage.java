package pages;

import org.openqa.selenium.WebDriver;

public abstract class AbstractPage {
    protected WebDriver driver;
    protected final String URL;

    public AbstractPage(WebDriver driver, String url){
        this.driver = driver;
        URL = url;
    }

    public void navigate(){
        driver.navigate().to(URL);
    }
}
