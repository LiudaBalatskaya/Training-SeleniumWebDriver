import base.TestBase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;

/**
 * Created by LiudaBalatskaya on 5/17/2017.
 */
public class LoginPageTest extends TestBase {
    @AfterMethod
    public void quit(){
        LoginPage.quit(driver);
    }

    @BeforeMethod
    public void gotoPage(){
        gotoPage(driver);
    }

    @Test
    public void credentials(){
       LoginPage.login(driver);
    }
}
