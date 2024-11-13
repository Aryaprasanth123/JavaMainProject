package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop extends Base {
	public void dragDrop()
	{
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement drag=driver.findElement(By.xpath("//span[text()=Draggable n°1]"));
		Actions action=new Actions(driver);
		action.moveToElement(drag);
		action.doubleClick(drag).perform();
		WebElement destination=driver.findElement(By.xpath("//div[@id='mydropzone']"));
		action.dragAndDrop(drag,destination).build().perform();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DragAndDrop drop=new DragAndDrop();
		drop.initializeBrowser();
		drop.dragDrop();

	}

}
