import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import users.User;
import users.UserPool;

import static org.testng.Assert.assertEquals;

public class LoginTest extends BaseTest{
    @Test
    public void shouldLogin() {
        HomePage homePage = new HomePage(webDriver);
        LoginPage loginPage = homePage.getLoginPage();

        User user = UserPool.getUser();
        homePage = loginPage.login(user);

        String accountButtonText = homePage.getAccountText();
        assertEquals(accountButtonText, "Hesabım");
    }

}
