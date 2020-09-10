package com.kodilla.selenium.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Set;

public class FacebookTestApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium-drivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://pl-pl.facebook.com/r.php");

        WebElement yearCombo = driver.findElement(By.xpath("//*[@id=\"birthday_wrapper\"]/div/span/span/select[3]"));
        Select yearSelect = new Select(yearCombo);
        yearSelect.selectByIndex(5);
    }
}
