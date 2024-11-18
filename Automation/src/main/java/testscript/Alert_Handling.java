package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Alert_Handling extends Base {
	public void alert()
	{
		driver.navigate().to("https://selenium.qabible.in/bootstrap-alert.php");
		WebElement alertclick=driver.findElement(By.xpath("//a[@id='alert-modal']"));
		alertclick.click();
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement click=driver.findElement(By.xpath("//button[@class='btn btn-success']"));
		click.click();
		driver.switchTo().alert().accept();
	}
	public void alertConfirm() {
		WebElement confirm=driver.findElement(By.xpath("//button[@class='btn btn-warning']"));	
		confirm.click();
		driver.switchTo().alert().dismiss();
	}
	public void alertClick()
	{
		WebElement clickconfirm=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		clickconfirm.click();
		driver.switchTo().alert().sendKeys("Hello");
		driver.switchTo().alert().accept();	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alert_Handling alerthandle=new Alert_Handling();
		alerthandle.initializeBrowser();
		alerthandle.alert();
		alerthandle.alertConfirm();
		alerthandle.alertClick();

	}

}
