package testscript;

public class Navigation_Comments extends Base {
	public void navigateCommands()
	{
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Navigation_Comments navigate=new Navigation_Comments();
		navigate.initializeBrowser();
		navigate.navigateCommands();
		

	}

}
