package testscript;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Upload {
	public WebDriver driver;
	public void fileUpload() throws AWTException
	{
		driver=new ChromeDriver();
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		driver.manage().window().maximize();
		WebElement selectpdf=driver.findElement(By.xpath("//a[@id='pickfiles']"));
		selectpdf.click();
		StringSelection select=new StringSelection("file:///C:/Users/user/Desktop/admitcardoa24.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select,null);
		Robot robot=new Robot();
		robot.delay(60);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
	}
	public void sendkeysExample()
	{
		driver=new ChromeDriver();
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		driver.manage().window().maximize();
		WebElement selectpdf=driver.findElement(By.xpath("//a[@id='pickfiles']"));
		//selectpdf.click();
		selectpdf.sendKeys("file:///C:/Users/user/Desktop/admitcardoa24.pdf");
	}

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		File_Upload file=new File_Upload();
		file.fileUpload();
		//file.open()
		file.sendkeysExample();

	}

}
