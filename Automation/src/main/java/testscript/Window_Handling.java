package testscript;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Handling  {
	public WebDriver driver;
	public void windowHandle()
	{
		driver=new ChromeDriver();
		driver.get("https://webdriveruniversity.com");
		driver.manage().window().maximize();
		WebElement handle=driver.findElement(By.xpath("//h1[text()='CONTACT US']"));
		handle.click();
		
		WebElement portal=driver.findElement(By.xpath("//h1[text()='LOGIN PORTAL']"));	
		portal.click();
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		
		Set<String> child=driver.getWindowHandles();
		String title="";
		
		//System.out.println("Child Window:"+child);
		for(String temp:child)
		{
			if(!temp.equals(parent))
			{
				System.out.println("Except parent from child windows"+temp);
				driver.switchTo().window(temp);
				System.out.println(driver.getTitle());
				title=driver.getTitle();
				
			}
			if(title.equals("WebDriver | Login Portal "))
			{
				//WebElement username=driver.findElement(By.xpath("//input[@id='text']"));
				//username.click();
				WebElement usertext=driver.findElement(By.xpath("//input[@id='text']"));
				usertext.sendKeys("arya");
				WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
				password.sendKeys("arya23");
				WebElement login=driver.findElement(By.xpath("//button[@id='login-button']"));
				login.click();
				
				
				
			}
			if(title.equals("WebDriver | Contact Us "))
			{
				WebElement firstname=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
				firstname.sendKeys("Arya");
				WebElement lastname=driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
				lastname.sendKeys("Prasanth");
				WebElement email=driver.findElement(By.xpath("//input[@placeholder='Email Address']"));
				email.sendKeys("aryaprasanthv@gmail.com");
				WebElement comment=driver.findElement(By.xpath("//textarea[@placeholder='Comments']"));
				comment.sendKeys("hjhudgfyfg");
			}
					
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Window_Handling window=new Window_Handling();
		window.windowHandle();

	}

}
