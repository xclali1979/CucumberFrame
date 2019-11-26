package stepDefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.LoginPage;
import utilities.Configuration;
import utilities.Driver;

public class VerifiedLoginFunctionatily {


LoginPage loginpage=new LoginPage();

    @Given("^Navigate to login page$")
    public void navigate_to_login_page() throws Throwable {
     Driver.driver.get(Configuration.getProperties("browserUrl"));


    }

    @Then("^User logs in with valid credential username\"([^\"]*)\" password\"([^\"]*)\"$")
    public void user_logs_in_with_valid_credential_username_password(String username, String password) throws Throwable {
loginpage.username.sendKeys(username);
loginpage.password.sendKeys(password);
loginpage.loginbutton.click();

    }

    @Then("^Verify user is in Homepage$")
    public void verify_user_is_in_Homepage() throws Throwable {
String Expected="Web Orders";
String actualTitle=Driver.driver.getTitle();
        Assert.assertEquals(actualTitle,Expected);

    }
    @Then("^User logs in with invalid credential username\"([^\"]*)\" password\"([^\"]*)\"$")
    public void user_logs_in_with_invalid_credential_username_password(String username, String password) throws Throwable {
        loginpage.username.sendKeys(username);
        loginpage.password.sendKeys(password);
        loginpage.loginbutton.click();
    }

    @Then("^Verify user gets error message \"([^\"]*)\"$")
    public void verify_user_gets_error_message(String errorMessage) throws Throwable {

   String actual=loginpage.errorMessage.getText() ;
    Assert.assertEquals(errorMessage,actual);

    }

}
