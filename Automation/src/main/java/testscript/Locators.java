package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base {
	

	public void idLocator()
	{
		//WebElement element_name=driver.findElement(By.Locator("attributevalue"));
		WebElement messagefield=driver.findElement(By.id("single-input-field"));
		WebElement inputfielda=driver.findElement(By.id("value-a"));
		WebElement inputfieldb=driver.findElement(By.id("value-b"));
		WebElement ajaxformsubject=driver.findElement(By.id("subject"));
		WebElement ajaxformdescription=driver.findElement(By.id("description"));
		
		
	}
	public void nameLocator()
	{
	WebElement name=driver.findElement(By.name("viewport"));
	}
	public void classLocator()
	{
		WebElement class1=driver.findElement(By.className("header-top"));	
	}
	public void cssSelector()
	{
		//first combination tag and id:tag#id
		WebElement css1=driver.findElement(By.cssSelector("input#single-input-field"));
		//tag and class : tag.class
		WebElement css2=driver.findElement(By.cssSelector("ul.navbar-nav"));
		//tag and attribute : tag[attribute=value]
		WebElement css3=driver.findElement(By.cssSelector("input[id=single-input-field]"));
		WebElement css4=driver.findElement(By.cssSelector("input[placeholder=Message]"));
		//combination of tag,class and attribute :: tag.class[attribute=value]
		WebElement css5=driver.findElement(By.cssSelector("input.form-control[id=single-input-field]"));
	}
		public void relativeXpath()
		{
	      WebElement xpath1=driver.findElement(By.xpath(" //input[@placeholder='Message']"));
	      
		}
		public void containsXpath()
		{
			//tagname[contains(@attributetype,'value')]
			WebElement cxpath1=driver.findElement(By.xpath("//input[contains(@placeholder,'Message')]"));	
		}
		public void textXpath()
		{
			////tagname[text()='value']
			WebElement txpath1=driver.findElement(By.xpath("//button[text()='Show Message']"));	
		}
		public void axes()
		{
			WebElement axe1=driver.findElement(By.xpath("//input[@placeholder='Message']//parent::div"));
			WebElement axe2=driver.findElement(By.xpath("//a[@href='index.php']//child::img[@alt='logo']"));
			
		}

		
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locators locator=new Locators();
		locator.initializeBrowser();
		locator.idLocator();
		

	}

}
