package Practices;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;



public class PracticeQA {
	void openWebppage(WebDriver driver)
	{
		String url="https://demoqa.com/text-box";
		driver.navigate().to(url);
		driver.manage().window().maximize();
		
	}
	
	void fullname(WebDriver driver)
	{
		WebElement name=driver.findElement(By.xpath("//*[@id='userName']"));
		name.sendKeys("Dhawal Sanjay Kale");
	}
	
	
	
	void email(WebDriver driver)
	{
		WebElement email=driver.findElement(By.xpath("//*[contains(@placeholder,'name@example.com')]"));
		email.sendKeys("dhawal.kale@gmail.com");
	}
	
	void currentaddress(WebDriver driver)
	{
		WebElement currentaddress=driver.findElement(By.xpath("//*[@id='currentAddress']"));
		currentaddress.sendKeys("Amravati");
	}
	
	void permanetaddress(WebDriver driver)
	{
		WebElement permanetaddress=driver.findElement(By.xpath("//*[@id='permanentAddress' and @class='form-control']"));
		permanetaddress.sendKeys("Amravati ");
	}
	
	
	void checkboxclick(WebDriver driver)
	{
		WebElement click=driver.findElement(By.id(""));
		click.click();
	}
	void Screeshot(WebDriver driver)
	{
		File Soureces=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try
		{
			FileHandler.copy(Soureces,new File("C:\\Users\\SHIV\\OneDrive\\Desktop\\Automation Testing\\TakeScreenShot/Failtestcase.jpg"));
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	void homeclick(WebDriver driver)
	{
		WebElement  homeclick=driver.findElement(By.xpath("//*[starts-with(@class,'rct-checkbox')]"));
		 homeclick.click();
	}
	void radiolick(WebDriver driver)
	{
		WebElement  radioclick=driver.findElement(By.id("item-2"));
	try
	{
		radioclick.click();
	}
	catch(Exception e)
	{
		
	}
	}
	void radiobuttonyes(WebDriver driver)
	{
		WebElement radiobuttonyes=driver.findElement(By.xpath("//*[starts-with(@for,'yesRadio')]"));
		radiobuttonyes.click();
	}
		
	
	
	
	


	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/SHIV/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		PracticeQA  obj=new PracticeQA  ();
		obj.openWebppage(driver);
		obj.fullname(driver);
	   obj.email(driver);
	 obj.currentaddress(driver);
	  obj.permanetaddress(driver);
	   obj.checkboxclick(driver);
	   obj.Screeshot(driver);
	    obj.homeclick(driver);
		obj.radiolick(driver);
		obj.radiobuttonyes(driver);
	    
	   
	 
	

	}

}
