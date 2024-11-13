package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Checkbox extends Base {
	public void checkBox()
	{
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement checkbox=driver.findElement(By.xpath("//input[@id='gridCheck']"));
		//checkbox.click();
		System.out.println(checkbox.isSelected());
	}
	public void radioBox()
	{
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement radiobx=driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
		//radiobx.click();
		System.out.println(radiobx.isEnabled());
	}
     public static void main(String[] args) {
		// TODO Auto-generated method stub
		Checkbox check=new Checkbox();
		check.initializeBrowser();
		check.checkBox();
		check.radioBox();

	}

}
