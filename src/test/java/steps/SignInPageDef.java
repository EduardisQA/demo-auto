package steps;

import config.UserConfig;
import io.cucumber.java.en.Then;
import pages.SignInPage;

public class SignInPageDef {
    SignInPage signInPage = new SignInPage();




    @Then("input login")
    public void inputLogin() {
        signInPage.inputLogin(UserConfig.USER_LOGIN);
    }

    @Then("input password")
    public void inputPassword() {
        signInPage.inputPassword(UserConfig.USER_PASSWORD);
    }
}
