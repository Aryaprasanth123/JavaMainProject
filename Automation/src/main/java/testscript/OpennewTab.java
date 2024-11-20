package testscript;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpennewTab {
	public WebDriver driver;
	public void openTab() throws AWTException
	{
		driver=new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_T);
		
	}

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		OpennewTab tab=new OpennewTab();
		tab.openTab();

	}

}
