package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

/**
 * Created by LiudaBalatskaya on 5/15/2017.
 */
public class TestBase {
    protected static WebDriver driver;
    protected static final String BASE_URL = "https://192.168.100.26/";


    public static void driverWait() {
        final int MAXIMUM_WAIT_TIME = 20;
        WebDriverWait wait = new WebDriverWait(driver, MAXIMUM_WAIT_TIME);
        }

    public static void gotoPage(WebDriver driver) {
        driver.get(BASE_URL);
    }

    @BeforeClass
    public static void setup() {
        driver = new ChromeDriver();
    }

    @AfterClass
    public void exit(){
        driver.close();
    }
}
