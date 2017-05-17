package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static org.testng.Assert.assertTrue;

/**
 * Created by LiudaBalatskaya on 5/17/2017.
 */
public class VacationPage {
    private static final By VACATION = By.cssSelector("#vacationMenu");
    private static final By HOME_PAGE = By.cssSelector("#name");
    private static final By VACATION_PAGE = By.cssSelector("#Create_Vacation");
    private static final By LIST_NATIFICATIONS = By.cssSelector("#list-of-recipients li");
    private static final By TO_CC = By.cssSelector(".altenates-approvers-container");

    public static void gotoVacationPage(WebDriver driver) {
        WebElement until = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(HOME_PAGE));
        driver.findElement(VACATION).click();
        WebElement until1 = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(VACATION_PAGE));
    }

    public static void notificationsTo(WebDriver driver) {
        List<WebElement> allElements = driver.findElements(LIST_NATIFICATIONS);

        for (WebElement element: allElements) {
            String str = element.getText();
            System.out.println(element.getText());
        }
    }

    public static void notificationCC(WebDriver driver) {
       // driver.findElements(TO_CC);
        List<WebElement> allElements = driver.findElements(TO_CC);
        int n = allElements.size();
        assertTrue(n==0);
    }

}
