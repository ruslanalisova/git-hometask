import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LibraryTest {
    private WebDriver driver = new ChromeDriver();

    @Before
    public void before() {
        driver.get("https://www.bookdepository.com/");
        try {
            WebElement cookiesYes = driver.findElement(By.cssSelector(".cookie-consent-buttons [class*='yes']"));
            cookiesYes.click();
        } catch (NotFoundException ignored) {
        }
    }

    @Test
    public void checkValidProductWasAdded() throws InterruptedException {
        Assert.assertEquals("https://www.bookdepository.com/", driver.getCurrentUrl());
        By searchInputButton = By.xpath(
                "//form[@id='book-search-form']//input[@class='text-input']");
        WebElement searchField = driver.findElement(searchInputButton);
        searchField.sendKeys("Little Women");
        WebElement searchButton = driver.findElement(By.xpath(
                "//*[contains(@class,'header-search-btn')]//*[contains(text(),'Search')]"));
        searchButton.click();
        Thread.sleep(2000);
        List<WebElement> itemTitles = driver.findElements(By.cssSelector(".item-info .title a"));
        String searchTitle = itemTitles.get(0).getText();
        WebElement addToBasket = driver.findElement(By.xpath(
                "//*[contains(@class,'book-item')]//*[contains(text(),'Add to basket')]"));

        addToBasket.click();
        Thread.sleep(2000);
        WebElement goToBasket = driver.findElement(By.cssSelector(
                "[class='btn btn-primary pull-right continue-to-basket string-to-localize link-to-localize']"));
        goToBasket.click();
        String basketTitle = driver.findElement(By.cssSelector(".basket-item .item-info a")).getText();
        Assert.assertEquals(searchTitle, basketTitle);
    }

    @Test
    public void verifyPricesOnListingAndBasket() throws InterruptedException {
        Assert.assertEquals("https://www.bookdepository.com/", driver.getCurrentUrl());
        By searchInputButton = By.xpath(
                "//form[@id='book-search-form']//input[@class='text-input']");
        WebElement searchField = driver.findElement(searchInputButton);
        searchField.sendKeys("Little Women");
        WebElement searchButton = driver.findElement(By.xpath(
                "//*[contains(@class,'header-search-btn')]//*[contains(text(),'Search')]"));
        searchButton.click();
        Thread.sleep(2000);
        String priceOnListing = driver.findElement(By.xpath(
                "//*[contains(@class,'price')]//*[contains(text(),'89,55 zł')]")).getText();
        WebElement addToBasket = driver.findElement(By.xpath(
                "//*[contains(@class,'book-item')]//*[contains(text(),'Add to basket')]"));

        addToBasket.click();
        Thread.sleep(2000);
        WebElement goToBasket = driver.findElement(By.cssSelector(
                "[class='btn btn-primary pull-right continue-to-basket string-to-localize link-to-localize']"));
        goToBasket.click();
        String priceOnBasket = driver.findElement(By.xpath(
                "//*[contains(@class,'price-wrap')]//*[contains(text(),'89,56 zł')]")).getText();

        Assert.assertEquals(priceOnListing, priceOnBasket); // the prices are different, so exception is displayed
    }

    @After
    public void quit() {
        driver.quit();
    }
}