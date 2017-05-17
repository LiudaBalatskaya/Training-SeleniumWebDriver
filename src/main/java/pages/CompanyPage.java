package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static base.TestBase.driverWait;
import static org.testng.Assert.assertTrue;

/**
 * Created by LiudaBalatskaya on 5/16/2017.
 */
public class CompanyPage {

    private static final By HOME_PAGE = By.cssSelector("#name");
    private static final By COMPANY = By.cssSelector("#companyMenu");
    private static final By COMPANY_PAGE = By.xpath(".//span[text()='Coherent Solutions, Inc.']");
    private static final By ISSOFT = By.xpath(".//span[text()='ISsoft Solutions']");
    private static final By CONTACT1 = By.xpath(".//*[@id='companyHeaders']//li[5]/a");
    private static final By MENU = By.xpath(".//*[@id='companyHeaders']");
    private static final By TITLE = By.xpath(".//*[@id='companyData']/div[1]/div/p");

    public static void gotoCompany(WebDriver driver) {
        WebElement until = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(HOME_PAGE));
        driver.findElement(COMPANY).click();
        WebElement until1 = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(COMPANY_PAGE));
    }

    public static void checkIssoft(WebDriver driver) {
        String name;
        name = driver.findElement(ISSOFT).getText();
        assertTrue(name.contentEquals("ISsoft Solutions")==true);
    }

    public static void checkCoherent(WebDriver driver) {
        String name;
        name = driver.findElement(COMPANY_PAGE).getText();
        assertTrue(name.contentEquals("Coherent Solutions, Inc.")==true);
    }

    public static void gotoIssoftContact(WebDriver driver) {
        driver.findElement(ISSOFT).click();
        WebElement until = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(ISSOFT));
        driverWait();
        String title = driver.findElement(TITLE).getText();
        assertTrue(title.contentEquals("ISsoft Solutions")==true);
        driver.findElement(CONTACT1).click();

    }

    public static void gotoCoherentContact(WebDriver driver) {
        driver.findElement(COMPANY_PAGE).click();
        driver.findElement(CONTACT1).click();
    }
}
