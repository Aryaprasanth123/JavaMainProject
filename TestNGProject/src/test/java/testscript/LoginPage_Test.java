package testscript;

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.awt.Robot;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginPage_Test extends Base {
  @Test
  @Parameters({"username","password"})
  public void verifyUserIsAbleToLoginValidCredenstials(String username,String password) throws AWTException {
	  
	  LoginPage login=new LoginPage(driver);
	  login.enterUsername(username);
	  login.enterPassword(password);
	  login.clickLogin();
	  boolean isHomepageisloaded=login.isDashboardLoaded();
	  assertTrue(isHomepageisloaded,"Homepage is not loaded");
  }
  @DataProvider(name="credentials")
  public Object[][] testData()
  {
	  Object data[][]= {{"carol","1q2w3e4r"},{"arya","1234"},{"vaidu","2345"}};
  
  return data;
  }
  @Test(dataProvider="credentials")
  public void userIsAbleToLoginDataProvider(String username,String password) throws Exception
  {
	  LoginPage login=new LoginPage(driver);
	  login.enterUsername(username);
	  login.enterPassword(password);
	  login.clickLogin();
	  boolean isHomepageisloaded=login.isDashboardLoaded();
	  assertTrue(isHomepageisloaded,"Homepage is not loaded");  
  }
}
