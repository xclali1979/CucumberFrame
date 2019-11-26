package stepDefs;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import pages.LoginPage;
import pages.OrdersHomepage;

import java.util.List;
import java.util.Map;

public class AddingOrderSteps {
    LoginPage loginpage=new LoginPage();
    OrdersHomepage order=new OrdersHomepage();
    @Then("^Then User logs in with valid credential username\"([^\"]*)\" password\"([^\"]*)\"$")
    public void then_User_logs_in_with_valid_credential_username_password(String username, String password) throws Throwable {
        loginpage.username.sendKeys(username);
        loginpage.password.sendKeys(password);
        loginpage.loginbutton.click();
    }

    @Then("^User cliks on order$")
    public void user_cliks_on_order() throws Throwable {
      order.ordersButton.click();
    }

    @Then("^User creates new order$")
    public void user_creates_new_order(DataTable dataTable) throws Throwable {
        List<Map<String,Object>> listofMaps=dataTable.asMaps(String.class,Object.class);
        System.out.println(listofMaps.size());
        //System.out.println(listofMaps.get(1));
        for(Map<String ,Object> ls: listofMaps){
            for(Map.Entry<String,Object> mp:ls.entrySet()){

                System.out.println(mp.getKey()+" : "+ mp.getValue());
            }
        }





        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)
    }

    @Then("^User verifies order is created$")
    public void user_verifies_order_is_created() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }


}
