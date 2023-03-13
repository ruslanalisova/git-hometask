package TaskPatterns.desktop.pages;
import TaskPatterns.abstractClasses.page.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasketPage extends AbstractPage {

    private WebDriver driver;

    @FindBy(css = ".basket-item .item-info a")
    public WebElement basketTitle;

    public BasketPage(WebDriver driver) {
        this.driver = driver;
    }
}
