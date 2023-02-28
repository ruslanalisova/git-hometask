package TaskPatterns.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingletonDriver {

    private WebDriver driver = new ChromeDriver();

    public WebDriver getDriver() {
        return driver;
    }
}