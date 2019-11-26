package stepDefs;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import pages.Hloginpage;
import utilities.BrowserUtils;
import utilities.Configuration;
import utilities.Driver;

import java.util.List;
import java.util.Map;

public class HaddingOrderSteps {
    Hloginpage page=new  Hloginpage( );
    int before;


        @Given("^Launch web browser$")
    public void launch_web_browser() throws Throwable {
        Driver.driver.get(Configuration.getProperties("browserUrl"));
        Thread.sleep(2000);

    }

    @Then("^User input username\"([^\"]*)\" and pasvword\"([^\"]*)\" login page$")
    public void user_input_username_and_pasvword_login_page(String user, String pass) throws Throwable {
         page.username.sendKeys(user);
         page.password.sendKeys(pass);
         Thread.sleep(1000);
         page.loginButton.click();
        Thread.sleep(1000);
    }

    @Then("^User click order$")
    public void user_click_order() throws Throwable {
        System.out.println(page.tablelist.size());
         before=page.tablelist.size();
         page.order.click();
         Thread.sleep(1000);

    }

    @Then("^User create new order$")
    public void user_create_new_order(DataTable table) throws Throwable {
        List<Map<String,String>> maplist=table.asMaps(String.class,String.class);
        BrowserUtils.dropDown(page.product,maplist.get(0).get("product"));
        page.quantity.clear();
        page.quantity.sendKeys(maplist.get(0).get("Quantitiy"));
        page.discount.clear();
        page.discount.sendKeys(maplist.get(0).get("Discount"));
        page.customername.sendKeys(maplist.get(0).get("customer name"));
        page.street.sendKeys(maplist.get(0).get("street"));
        page.city.sendKeys(maplist.get(0).get("city"));
        page.state.sendKeys(maplist.get(0).get("state"));
        page.zip.sendKeys(maplist.get(0).get("zip"));
        page.cardvisa.click();
        page.cardno.sendKeys(maplist.get(0).get("card no"));
        page.expiredate.sendKeys(maplist.get(0).get("expire date"));
        Thread.sleep(2000);
        page.process.click();
        Thread.sleep(2000);
        page.viewallorders.click();
        Thread.sleep(1000);


    }

    @Then("^User click view all orders and verify is created$")
    public void user_click_view_all_orders_and_verify_is_created() throws Throwable {
        System.out.println(before);
        int after=page.tablelist.size();
        System.out.println(after);
        Assert.assertEquals(before+1,after);


    }

    @Then("^User click view all orders and verify isNot created$")
    public void user_click_view_all_orders_and_verify_isNot_created() throws Throwable {
        System.out.println(before);
        int after=page.tablelist.size();
        System.out.println(after);
        Assert.assertEquals(before,after);
    }

}
