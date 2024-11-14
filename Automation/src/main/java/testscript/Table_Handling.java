package testscript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Table_Handling extends Base {
	public void fullTable()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement table=driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
		System.out.println(table.getText());
	}
	public void tableRow()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement row=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[3]"));
		System.out.println(row.getText());
		
	}
	public void selectParticularElement()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement tabledata=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[1]/td[1]"));
		System.out.println(tabledata.getText());
	}
	public void searchParticularElement()
	{
		String input="Tiger Nixon";
		List <WebElement> particular =driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[1]"));
		for(WebElement element:particular)
		{
			if(element.getText().equals(input))
			{
				System.out.println("Element present is :"+element.getText());
			}
		}
	}
	public void particularColumn()
	{
		List <WebElement> column =driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[4]"));
		for(WebElement item:column)
		{
			System.out.println(item.getText());
		}
	}
	public void searchColumnElement()
	{
		String in="Tokyo";
		List <WebElement> col =driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr[2]/td[3]"));
		for(WebElement element1:col)
		{
			if(element1.getText().equals(in))
			{
				System.out.println("Element present in column:"+element1.getText());
			}
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table_Handling tablehandle=new Table_Handling();
		tablehandle.initializeBrowser();
		tablehandle.fullTable();
		System.out.println("*********************");
		tablehandle.tableRow();
		tablehandle.selectParticularElement();
		tablehandle.searchParticularElement();
		tablehandle.particularColumn();
		tablehandle.searchColumnElement();

	}

}
