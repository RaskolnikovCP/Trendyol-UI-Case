import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class NewUserTest extends BaseTest{

    WebElement element;

    @Test
    public void newUser(){

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});

        HomePage homePage = new HomePage(webDriver);

        String email = "fsy56155@cuoly.com";

        String password = "1234qwe";

        //here, I need to hover up the button to choose the sign-up button
        //element.findElement(By.className("link-text")).

        element.findElement(By.className("signup-button")).click();

        element.findElement(By.id("register-email")).sendKeys(email);

        element.findElement(By.id("register-password-input")).sendKeys(password);

        element.findElement(By.className("q-primary")).click();

    }

}
