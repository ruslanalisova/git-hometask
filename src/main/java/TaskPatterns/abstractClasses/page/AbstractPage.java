package TaskPatterns.abstractClasses.page;

import TaskPatterns.driver.SingletonDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class AbstractPage {

    private String pageUrl;
    private String pageUrlPattern;
    protected WebDriver driver;

    public void setPageUrl(String pageUrl) {

        this.pageUrl = pageUrl;
    }

    public String getPageUrl() {

        return pageUrl;
    }

    public String setPageUrlPattern(String pageUrlPattern) {

        return this.pageUrlPattern = pageUrlPattern;
    }

    public String getPageUrlPattern() {

        return pageUrlPattern;
    }

    public void setDriver(WebDriver driver) {
        this.driver = SingletonDriver.getDriver();
        PageFactory.initElements(driver, this);
    }
}