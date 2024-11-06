package testscript;

public class Browser_Commands extends Base {
	public void browserCommands()
	{
		String title=driver.getTitle();
		System.out.println(title);
		String current=driver.getCurrentUrl();
		System.out.println(current);
		String pagesource=driver.getPageSource();
		System.out.println(pagesource);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser_Commands browser=new Browser_Commands();
		browser.initializeBrowser();
		browser.browserCommands();

	}

}
