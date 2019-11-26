package stepDefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.Hloginpage;
import pages.LoginPage;
import utilities.Configuration;
import utilities.Driver;

public class HloginSteps {
    Hloginpage loginPage=new Hloginpage();

    @Given("^launch web browser$")
    public void launch_web_browser() throws Throwable {
       Driver.driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
       Thread.sleep(2000);
    }


    @When("^user input username\"([^\"]*)\"$")
    public void user_input_username(String user) throws Throwable {
        loginPage.username.sendKeys(user);

    }

    @When("^password \"([^\"]*)\"$")
    public void password(String password) throws Throwable {
        loginPage.password.sendKeys(password);
        Thread.sleep(3000);
        loginPage.loginButton.click();
        Thread.sleep(3000);

    }

    @Then("^User validate login \"([^\"]*)\"$")
    public void user_validate_login(String expected) throws Throwable {
        String actual=Driver.driver.getTitle();
        Assert.assertEquals(expected,actual);

    }




}
