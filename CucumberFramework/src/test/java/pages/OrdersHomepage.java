package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class OrdersHomepage {
    WebDriver driver;
    public OrdersHomepage(){
    this.driver= Driver.driverSetup("chrome");
    PageFactory.initElements(driver,this);

    }

    @FindBy(xpath="//*[@href=\"Process.aspx\"]")
    public WebElement ordersButton;

}
