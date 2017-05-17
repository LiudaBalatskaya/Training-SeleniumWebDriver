import base.TestBase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.VacationPage;

/**
 * Created by LiudaBalatskaya on 5/17/2017.
 */
public class VacationTest extends TestBase{
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
    public void gotoVacationPage() {
        driverWait();
        VacationPage.gotoVacationPage(driver);
        driverWait();
    }

    @Test
    public void notificationsTo() {
        driverWait();
        VacationPage.gotoVacationPage(driver);
        driverWait();
        VacationPage.notificationsTo(driver);
        driverWait();
    }

    @Test
    public void notificationCC() {
        driverWait();
        VacationPage.gotoVacationPage(driver);
        driverWait();
        VacationPage.notificationCC(driver);
        driverWait();
    }
}
