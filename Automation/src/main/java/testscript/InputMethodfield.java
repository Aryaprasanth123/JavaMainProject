package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class InputMethodfield extends Base {
	public void getMessage()
	{
		WebElement input=driver.findElement(By.xpath("//a[@href='single-form-demo.php']"));
		input.click();
		WebElement msg=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		msg.sendKeys("Welcome");
		WebElement showmessage=driver.findElement(By.xpath("//button[@id='button-one']"));
		showmessage.click();
		WebElement value1=driver.findElement(By.xpath("//input[@id='value-a']"));
		value1.click();
		WebElement value2=driver.findElement(By.xpath("//input[@id='value-b']"));
		value2.click();
		WebElement total=driver.findElement(By.xpath("//button[@id='button-two']"));
		total.click();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputMethodfield inputmethod=new InputMethodfield();
		inputmethod.initializeBrowser();
		inputmethod.getMessage();

	}

}
