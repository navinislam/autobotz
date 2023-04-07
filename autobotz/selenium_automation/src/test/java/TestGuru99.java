import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TestGuru99 extends BasePage {

    private String url = "https://demo.guru99.com/test/web-table-element.php";

    private String tableHeaders = "#leftcontainer > table > thead > tr > th";
    private String rowColumn = "td";
    private String tableRows = "#leftcontainer > table > tbody > tr ";

    // Q2
    @Test
    void guru99TableTest() {
        driver.get(url);

        List<WebElement> headers = driver.findElements(By.cssSelector(tableHeaders));
//        get column headers
        System.out.println(headers.size());
        List<WebElement> totalRows = driver.findElements(By.cssSelector(tableRows));
        //        get all  rows
        System.out.println(totalRows.size());

        for (int i = 0; i < totalRows.size(); i++) {
            List<WebElement> rowColumns = totalRows.get(i).findElements(By.cssSelector(rowColumn));
//            System.out.println(rowColumns.get(0).getText());
            if (rowColumns.get(0).getText().contains("IDFC")) {
                for (int j = 1; j < headers.size(); j++) {
//                    Getting header for j-TH column
                    System.out.println(headers.get(j).getText());
//                    getting value of j-th column at i-th row
                    System.out.println(rowColumns.get(j).getText());
                }

            }

        }

    }
}

