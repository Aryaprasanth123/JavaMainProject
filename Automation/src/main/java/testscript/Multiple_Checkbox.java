package testscript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Multiple_Checkbox extends Base {
	public void multipleCheck()
	{
		driver.get("https://selenium.qabible.in/check-box-demo.php");
		List <WebElement> checkbox=driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(WebElement checkbox1:checkbox)
		{
			checkbox1.click();
			System.out.println(checkbox1.isEnabled());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multiple_Checkbox check=new Multiple_Checkbox();
		check.initializeBrowser();
		check.multipleCheck();

	}

}
