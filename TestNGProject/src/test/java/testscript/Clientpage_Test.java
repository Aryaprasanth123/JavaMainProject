package testscript;

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.awt.Robot;

import org.testng.annotations.Test;

import pages.Client_Page;

public class Clientpage_Test extends Base{
  @Test
  public void verifyUserisAbleToSearchClientDetails() throws AWTException {
	 Client_Page client=new Client_Page(driver);
	 client.enterUsername("carol");
	 client.enterPassword("1q2w3e4r");
	 client.clickLogin();
	 client.clickClient();
	 client.clientName("Arya");
	 client.clientId("123");
	 client.clientSearch();
	 boolean isClientDetailsLoaded=client.isSearchDetailsisDisplayed();
	 assertTrue(isClientDetailsLoaded,"search item is not displayed");
	 
	 
  }
}


