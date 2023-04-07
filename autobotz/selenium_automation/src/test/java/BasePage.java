import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class BasePage {
    WebDriver driver;

    @BeforeAll
    static void setupAll() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--headless=new");
        driver = WebDriverManager.chromedriver().capabilities(options).create();
    }

    @AfterEach
    void teardown() {
        driver.quit();
    }


    void goToURL(String url){
        driver.get(url);
    }

     void sendKeysToField(String css_selector, String input){

        driver.findElement(By.cssSelector(css_selector)).sendKeys(input);

    }

    void waitForElementClickable(String css_selector){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(css_selector)));

    }
    void clickElement(String css_selector){

        driver.findElement(By.cssSelector(css_selector)).click();

    }

    void selectElement(String css_selector,String visibleText){
        WebElement selectElement = driver.findElement(By.cssSelector(css_selector));
        Select select = new Select(selectElement);
        select.selectByVisibleText(visibleText);

    }


     String getTextFromElement(String cssSelector){
        return driver.findElement(By.cssSelector(cssSelector)).getText();
    }

}
