package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\selenium-drivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl");

        WebElement button = driver.findElement(By.xpath("//button[contains(@data-role, \"accept\")]"));
        button.click();

        WebElement categoryList = driver.findElement(By.xpath("//select[contains(@aria-label, \"Kategoria\")]"));
        Select category = new Select(categoryList);
        category.selectByIndex(3);

        WebElement searchField = driver.findElement(By.xpath("//input[@type=\"search\"]"));
        searchField.sendKeys("Mavic mini");

        WebElement searchButton = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
        searchButton.click();
    }
}
