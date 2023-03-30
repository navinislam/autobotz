import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class TestForms extends BasePage{

    private String url = "https://testpages.herokuapp.com/styled/basic-html-form-test.html";
    private String usernameField = "[name='username']";
    private String passwordField = "[name='password']";
    private String commentsField = "[name='comments']";
    private String checkboxes = "[name='checkboxes[]'";
    private String radioOption = "[value='rd3']";
    private String selectItems = "[name='multipleselect[]']";

    private String dropDown = "[name='dropdown']";

    private String submitButton = "[value='submit']";

    private String [] submittedSelectors  = {
            "#_valueusername","#_valuepassword","#_valuecomments","#_valuecheckboxes0","#_valuecheckboxes1","#_valuecheckboxes2","#_valueradioval","#_valuemultipleselect0",
            "#_valuedropdown",
    };

    @Test
    void userFillsForm() throws InterruptedException {
        driver.get(url);
// Username field
        sendKeysToField(usernameField,"Myusername");
//        Password field
        sendKeysToField(passwordField,"Mypassword");
//        Comment box
        driver.findElement(By.cssSelector(commentsField)).clear();
        sendKeysToField(commentsField, "Hello world");
// Check boxes
        List<WebElement> checkBoxesList = driver.findElements(By.cssSelector(checkboxes));

        for (WebElement webElement : checkBoxesList) {
            String checked = webElement.getAttribute("checked");
            String checkboxSelector = "[value='"+ webElement.getAttribute("value") +"']";
            if (checked == null){
                clickElement(checkboxSelector);

            }

        }
//        Radio option
        clickElement(radioOption);
//        Multiple select
        selectElement(selectItems,"Selection Item 4");
//        Dropdown
        selectElement(dropDown,"Drop Down Item 5");
// Submit
        clickElement(submitButton);

// Get all submitted values
        List<String> submittedValues = new ArrayList<>();;

        for (String selector : submittedSelectors) {
            submittedValues.add(getTextFromElement(selector));


        }

        System.out.println(submittedValues);

    }


}
