package TaskPatterns.desktop.pages;

import TaskPatterns.abstractClasses.page.AbstractPage;
import TaskPatterns.desktop.fragment.NavigateByFragment;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends AbstractPage {

    private WebDriver driver;

    public NavigateByFragment navigateBy;

    @FindBy(xpath = "//form[@id='book-search-form']//input[@class='text-input']")
    public WebElement searchField;

    @FindBy(xpath = "//*[contains(@class,'header-search-btn')]//*[contains(text(),'Search')]")
    public WebElement searchButton;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}