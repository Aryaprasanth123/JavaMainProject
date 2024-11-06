package testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public WebDriver driver;
	public void initializeBrowser()
	{
		driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/index.php");
		driver.manage().window().maximize()	;}
	public void quitClose()
	{
		driver.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base ob=new Base();
		ob.initializeBrowser();
		ob.quitClose();

	}

}
