package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by LiudaBalatskaya on 5/15/2017.
 */
public class LoginPage {

    private static final By FORM = By.xpath(".//*[@id='main_div']/div[1]/form/div");

    private static final String BASE_USER = "EugenBorisik";
    private static final String PASSWORD = "qwerty12345";

    private static final By USER_NAME = By.xpath("//*[@id='Username']");
    private static final By USER_NAME_CSS = By.cssSelector("#Username");

    private static final By PASSWORD_INPUT = By.xpath(".//*[@id='Password']");
    private static final By PASSWORD_INPUT_CSS = By.cssSelector("#Password");

    private static final By SIGN_IN = By.xpath("//*[@id='SubmitButton']");
    private static final By SIGN_IN_CSS = By.cssSelector("#SubmitButton");

    private static final By SIGN_OUT = By.xpath(".//*[@id='divMenu']//*[@id='welcomeDivContent']//a[@href='/Authentication/SignOut']");
    private static final By SIGN_OUT1 = By.xpath(".//*[@id='main_div']");

    public static void enterUserName(WebDriver driver) {
        driver.findElement(USER_NAME).sendKeys(BASE_USER);
    }

    public static void enterPassword(WebDriver driver){
        driver.findElement(PASSWORD_INPUT).sendKeys(PASSWORD);
    }

    public static void submit(WebDriver driver){
         driver.findElement(SIGN_IN).click();
    }

    public static void quit(WebDriver driver){
       driver.findElement(SIGN_OUT).click();
    }

    public static void login(WebDriver driver) {
        enterUserName(driver);
        enterPassword(driver);
        submit(driver);
    }

}
