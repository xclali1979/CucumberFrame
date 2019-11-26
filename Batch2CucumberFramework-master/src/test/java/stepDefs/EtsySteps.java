package stepDefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.EtsyHomePage;
import pages.EtsyResultPage;
import utilities.Configuration;
import utilities.Driver;

public class EtsySteps {

    EtsyHomePage etsyHomePage=new EtsyHomePage();
    EtsyResultPage etsyResultPage = new EtsyResultPage();

    @Given("^Navigate Etsy Homepage$")
    public void navigate_Etsy_Homepage() throws Throwable {
        Driver.driver.get(Configuration.getProperties("etsyUrl"));
    }

    @When("^User searches for \"([^\"]*)\"$")
    public void user_searches_for(String item) throws Throwable {
        etsyHomePage.searchBox.sendKeys(item+ Keys.ENTER);
    }

    @Then("^Validate search message have word \"([^\"]*)\"$")
    public void validate_search_message_have_word(String item) throws Throwable {
        String actualSearchMessage = etsyResultPage.searchMessage.getText();
        Assert.assertEquals(item, actualSearchMessage);
    }

    @When("^User clicks on \"([^\"]*)\"$")
    public void user_clicks_on(String department) throws Throwable {

        if(etsyHomePage.JeweleryA.getText().equalsIgnoreCase(department)){
            etsyHomePage.JeweleryA.click();
        }else if(etsyHomePage.ClothesS.getText().equalsIgnoreCase(department)){
            etsyHomePage.ClothesS.click();
        }else if(etsyHomePage.HomeL.getText().equalsIgnoreCase(department)){
            etsyHomePage.HomeL.click();
        }else if(etsyHomePage.WeddingP.getText().equalsIgnoreCase(department)){
            etsyHomePage.WeddingP.click();
        }else if(etsyHomePage.ToysE.getText().equalsIgnoreCase(department)){
            etsyHomePage.ToysE.click();
        }
    }

    @Then("^User validate title \"([^\"]*)\"$")
    public void user_validate_title(String title) throws Throwable {
        String actualTitle=Driver.driver.getTitle();
        Assert.assertEquals(title,actualTitle);
    }

}
