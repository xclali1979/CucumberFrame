package stepDefs;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.OrdersHomePage;
import pages.OrdersPage;
import utilities.Driver;

import java.util.List;
import java.util.Map;

public class AddingOrderSteps {

    OrdersHomePage ordersHomePage = new OrdersHomePage();
    OrdersPage ordersPage = new OrdersPage();
    int initialOrderCount;

    @Then("^User clicks on Order$")
    public void user_clicks_on_Order() throws Throwable {
        initialOrderCount = ordersHomePage.orderRows.size();
        ordersHomePage.OrderButton.click();
    }

    @Then("^User creates new order$")
    public void user_creates_new_order(DataTable dataTable) throws Throwable {
        List<Map<String, Object>> listOfMaps = dataTable.asMaps(String.class, Object.class);

        Select select = new Select(ordersPage.productName);
        select.selectByVisibleText(listOfMaps.get(0).get("Product Name").toString());
        ordersPage.quantity.sendKeys(listOfMaps.get(0).get("Quantity").toString());
        ordersPage.customerName.sendKeys(listOfMaps.get(0).get("Customer Name").toString());
        ordersPage.street.sendKeys(listOfMaps.get(0).get("Street").toString());
        ordersPage.city.sendKeys(listOfMaps.get(0).get("City").toString());
        ordersPage.state.sendKeys(listOfMaps.get(0).get("State").toString());
        ordersPage.zipCode.sendKeys(listOfMaps.get(0).get("Zip").toString());
        ordersPage.visaCardType.click();
        ordersPage.cardNr.sendKeys(listOfMaps.get(0).get("Card Nr").toString());
        ordersPage.expireDate.sendKeys(listOfMaps.get(0).get("Expire Date").toString());
        Thread.sleep(5000);
        ordersPage.processButton.click();
        Thread.sleep(8000);
    }

    @Then("^User verifies Order \"([^\"]*)\" created$")
    public void user_verifies_Order_created(String isCondition) throws Throwable {
        ordersPage.ordersViewButton.click();
        Thread.sleep(10000);
        int afterOrderCreated = ordersHomePage.orderRows.size();
        if (isCondition.equalsIgnoreCase("is")) {
            Assert.assertEquals("Initial order number is: " + initialOrderCount + "\n" +
                            "After you created order the row number is: " + afterOrderCreated,
                    initialOrderCount + 1, afterOrderCreated);
        } else {
            Assert.assertEquals("Initial order number is: " + initialOrderCount + "\n" +
                            "After you created order the row number is: " + afterOrderCreated,
                    initialOrderCount, afterOrderCreated);
        }
    }
}
