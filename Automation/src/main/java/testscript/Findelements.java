package testscript;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Findelements extends Base {
	public void findElements()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		List <WebElement> msg=driver.findElements(By.xpath("//input[@type='text']"));
		for(WebElement msg1:msg)
		{
		msg1.sendKeys("Hello");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Findelements msg2=new Findelements();
		msg2.initializeBrowser();
		msg2.findElements();

	}
}


