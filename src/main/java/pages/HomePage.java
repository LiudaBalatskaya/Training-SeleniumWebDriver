package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

/**
 * Created by LiudaBalatskaya on 5/15/2017.
 */
public class HomePage {

    private static final By HOME_PAGE = By.cssSelector("#name");
    private static final By LIST_OFFICES = By.xpath(".//*[@id='officeWidgetContent']//li");
    private static final By OFFICE = By.cssSelector("div#main_div");
    private static final By LUNCH_VOTING = By.cssSelector(".resource-link-container.lunchvoting");

    public static void gotoOffice(WebDriver driver) {
        WebElement until = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(HOME_PAGE));
        List<WebElement> allElements = driver.findElements(LIST_OFFICES);

        for (WebElement element: allElements) {
            String str = element.getText();
            System.out.println(element.getText());
            if(str.contentEquals("Chapaeva 118")){
                element.click();
            }

        }
        until = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(OFFICE));
    }

    public static void lunchVoting(WebDriver driver) {
        WebElement until = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(HOME_PAGE));
        driver.findElement(LUNCH_VOTING).click();
    }
}
