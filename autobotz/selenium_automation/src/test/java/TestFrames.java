import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

class TestFrames extends BasePage{

        String url = "https://testpages.herokuapp.com/frames/index.html";

     @Test
        void testFrames() throws InterruptedException {
         driver.get(url);
         driver.switchTo().frame("menu");
         clickElement(" [href='white.html']");
         driver.switchTo().parentFrame();
         driver.switchTo().frame("content");
         clickElement("[href='content.html']");
         clickElement("[href='green.html']");
         driver.switchTo().parentFrame();
         driver.switchTo().frame("content");
         clickElement("[href='content.html']");
         driver.switchTo().parentFrame();
         driver.switchTo().frame("menu");
         System.out.println(getTextFromElement("h3"));

     }
     }
