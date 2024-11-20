package testscript;

import java.awt.datatransfer.StringSelection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Upload {
	public WebDriver driver;
	public void fileUpload()
	{
		driver=new ChromeDriver();
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		driver.manage().window().maximize();
		WebElement selectpdf=driver.findElement(By.xpath("//a[@id='pickfiles']"));
		selectpdf.click();
		StringSelection select=new StringSelection("file:///C:/Users/user/Desktop/admitcardoa24.pdf");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File_Upload file=new File_Upload();
		file.fileUpload();

	}

}
