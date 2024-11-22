package testscript;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginPage_Test extends Base {
  @Test
  public void verifyUserIsAbleToLoginValidCredenstials() {
	  LoginPage login=new LoginPage(driver);
	  login.enterUsername("carol");
	  login.enterPassword("1q2w3e4r");
	  login.clickLogin();
	  boolean isHomepageisloaded=login.isDashboardLoaded();
	  assertTrue(isHomepageisloaded,"Homepage is not loaded");
  }
}
