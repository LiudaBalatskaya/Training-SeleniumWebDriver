import base.TestBase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

/**
 * Created by LiudaBalatskaya on 5/15/2017.
 */
public class HomePageTest extends TestBase {

    @AfterMethod
    public void quit(){
        LoginPage.quit(driver);
    }

    @BeforeMethod
    public void gotoPage(){
        gotoPage(driver);
        LoginPage.login(driver);
    }

    @Test
    public void homePage() {
        driverWait();
        HomePage.gotoOffice(driver);
        driverWait();
    }

    @Test
    public void toLunchVoting() {
        driverWait();
        HomePage.lunchVoting(driver);
        driverWait();
    }

}
