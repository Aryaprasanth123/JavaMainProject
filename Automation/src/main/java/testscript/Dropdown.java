package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdown extends Base {
	public void dropDown()
	{
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		WebElement selectdrop=driver.findElement(By.xpath("//select[@id='single-input-field']"));
		//selectdrop.click();
		Select drop=new Select(selectdrop); 
		//drop.selectByVisibleText("Red");
		//drop.selectByIndex(1);
		drop.selectByValue("Red");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dropdown dropdown=new Dropdown();
		dropdown.initializeBrowser();
		dropdown.dropDown();
		

	}

}
