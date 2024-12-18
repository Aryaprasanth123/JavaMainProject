package pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
public WebDriver driver;
public LoginPage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
@FindBy(id="loginform-username") WebElement username;
@FindBy(id="loginform-password") WebElement password;
@FindBy(xpath="//button[@class='btn btn-default']") WebElement loginbtn;
@FindBy(xpath="//a[text()='Dashboard']") WebElement dashboard;
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
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.elementToBeClickable(loginbtn));
	loginbtn.click();

}
public boolean isDashboardLoaded()
{
return dashboard.isDisplayed();	
}
}
