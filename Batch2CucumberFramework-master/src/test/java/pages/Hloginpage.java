package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Hloginpage {
    WebDriver driver;
    public Hloginpage(){
    this.driver= Driver.driverSetup("chrome");
        PageFactory.initElements(driver,this);}


     @FindBy(xpath="//input[@id='ctl00_MainContent_username']")
     public WebElement username;

    @FindBy(xpath="//input[@id='ctl00_MainContent_password']")
    public WebElement password;

    @FindBy(xpath="//input[@id='ctl00_MainContent_login_button']")
    public WebElement loginButton;




}
