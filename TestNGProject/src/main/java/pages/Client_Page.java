package pages;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Client_Page {
	public WebDriver driver;
	 public Client_Page(WebDriver driver)
	 {
	 	this.driver=driver;
	 	PageFactory.initElements(driver,this);
	 }
	 @FindBy(xpath="//input[@id='loginform-username']") WebElement username;
	 @FindBy(xpath="//input[@id='loginform-password']") WebElement password;
	 @FindBy(xpath="//button[@class='btn btn-default']") WebElement loginbtn;
	 @FindBy(xpath="//a[text()='Dashboard']") WebElement dashboard;
	 @FindBy(xpath="//a[@href='/payrollapp/client/index']") WebElement clientbtn;
	 @FindBy(xpath="//input[@id='clientsearch-client_name']") WebElement clientname;
	 @FindBy(xpath="//input[@id='clientsearch-id']") WebElement clientid;
	 @FindBy(xpath="//button[text()='Search']") WebElement searchbtn;
	 public void enterUsername(String usernamefield)
	 {
	 	username.sendKeys(usernamefield);
	 }
	 public void enterPassword(String passwordfield)
	 {
	 	password.sendKeys(passwordfield);
	 }
	 public void clickLogin() throws AWTException
	 {
	 	loginbtn.click();
	 	Robot robot=new Robot();
	 	robot.delay(1000);
	 }
	 public void clickClient()
	 {
		 clientbtn.click();
	 }
	 public void clientName(String client)
	 {
		clientname.sendKeys(client); 
	 }
	 public void clientId(String cid)
	 {
		 clientid.sendKeys(cid);
	 }
	 public void clientSearch() throws AWTException
	 {
	 searchbtn.click();
	 Robot robot=new Robot();
	 robot.delay(1000);
	 
	 }
	 public boolean isSearchDetailsisDisplayed()
	 {
	 return searchbtn.isDisplayed();	
	 }
}


