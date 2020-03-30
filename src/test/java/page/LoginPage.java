package page;

import base.BasePage;
import org.openqa.selenium.WebDriver;

import static constants.Constant.*;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage moveToLogin() {
        click(LOG_IN);
        return this;
    }

    public LoginPage sendEmail(String email) {
        sendKeys(EMAIL, email);
        return this;
    }

    public LoginPage sendPassword(String password) {
        sendKeys(PASSWORD, password);
        return this;
    }

    public LoginPage clickButton() {
        click(LOG_IN_BUTTON);
        return this;
    }
}
