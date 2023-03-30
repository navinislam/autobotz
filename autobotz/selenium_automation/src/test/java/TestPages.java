import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

class TestPages extends BasePage{

        private String alertBox = "alertexamples";
        private String confirmBox = "confirmexample";
        private String promptBox = "promptexample";
        List<String> boxes = new ArrayList<>();
        List<String> alert_texts_list = new ArrayList<>();;

        String url = "https://testpages.herokuapp.com/styled/alerts/alert-test.html";
        String styled_css_button = "styled-click-button";

     @Test
        void alertTestUsingId() {
         driver.get(url);

         List<WebElement> alerts = driver.findElements(By.className(styled_css_button));
         System.out.println(alerts.size());

         for (WebElement webElement : alerts) {
             String id = webElement.getAttribute("id");
             String text = webElement.getAttribute("value");
             boxes.add(text);
             driver.findElement(By.id(id)).click();
             Alert alert = driver.switchTo().alert();
             String alert_text =alert.getText();
             alert_texts_list.add(alert_text);

             if (id.equals(alertBox)){

                 alert.accept();

             }

             else if (id.equals(confirmBox)){
                 alert.accept();

             }

             else if (id.equals(promptBox)){
                 alert.sendKeys("Changed");
                 alert.accept();

             }


         }
         System.out.println(boxes);
         System.out.println(alert_texts_list);

        }

    @Test
    void alertTestUsingAlertText() {
        driver.get(url);

        List<WebElement> alert_boxes = driver.findElements(By.className(styled_css_button));
        System.out.println(alert_boxes.size());

        for (WebElement webElement : alert_boxes) {
            String id = webElement.getAttribute("id");
            String text = webElement.getAttribute("value");
            boxes.add(text);
            driver.findElement(By.id(id)).click();
            Alert alert = driver.switchTo().alert();
            String alert_text =alert.getText();
            alert_texts_list.add(alert_text);

            if (alert_text.equals("I am an alert box!")){

                alert.accept();

            }

            else if (alert_text.equals("I am a confirm alert")){
                alert.accept();

            }

            else if (alert_text.equals("I prompt you")){
                alert.sendKeys("Changed");
                alert.accept();

            }


        }
        System.out.println(boxes);
        System.out.println(alert_texts_list);


    }


}

