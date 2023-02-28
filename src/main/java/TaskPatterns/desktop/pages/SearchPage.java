package TaskPatterns.desktop.pages;

import TaskPatterns.abstractClasses.page.AbstractPage;
import TaskPatterns.desktop.fragment.NavigateByFragment;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchPage extends AbstractPage {

    private WebDriver driver;
    public NavigateByFragment navigateBy;

    @FindBy(css = ".item-info .title a")
    public List<WebElement> itemTitles;

    @FindBy(xpath = "//*[contains(@class,'book-item')]//*[contains(text(),'Add to basket')]")
    public WebElement addToBasket;

    @FindBy(css = "[class='btn btn-primary pull-right continue-to-basket string-to-localize link-to-localize']")
    public WebElement goToBasket;

    @FindBy(css = ".sale-price")
    public List<WebElement> itemPrices;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}