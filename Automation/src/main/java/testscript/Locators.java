package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base {
	

	public void idLocator()
	{
		//WebElement element_name=driver.findElement(By.Locator("attributevalue");
		WebElement messagefield=driver.findElement(By.id("single-input-field"));
		WebElement inputfielda=driver.findElement(By.id("value-a"));
		WebElement inputfieldb=driver.findElement(By.id("value-b"));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
