import base.TestBase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CompanyPage;
import pages.LoginPage;

/**
 * Created by LiudaBalatskaya on 5/16/2017.
 */
public class CompanyPageTest extends TestBase {

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
    public void gotoCompanyPage() {
       driverWait();
       CompanyPage.gotoCompany(driver);
       driverWait();
    }

    @Test
    public void checkCoherentContact() {
        driverWait();
        CompanyPage.gotoCompany(driver);
        driverWait();
        CompanyPage.checkCoherent(driver);
    }

    @Test
    public void gotoCoherentContact() {
         driverWait();
        CompanyPage.gotoCompany(driver);
        driverWait();
        CompanyPage.gotoCoherentContact(driver);
        driverWait();
    }

    @Test
    public void checkIssoft() {
        driverWait();
        CompanyPage.gotoCompany(driver);
        CompanyPage.checkIssoft(driver);
        driverWait();
    }

    @Test
    public void gotoIssoftContact() {
        driverWait();
        CompanyPage.gotoCompany(driver);
        driverWait();
        CompanyPage.gotoIssoftContact(driver);
        driverWait();
    }
}
