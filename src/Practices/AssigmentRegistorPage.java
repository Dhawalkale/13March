package Practices;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssigmentRegistorPage {
	
	void OpWebPage( WebDriver driver)
	{
		String url="http://register.rediff.com/register/register.php?FormName=user_details";
		driver.navigate().to(url);
		driver.manage().window().maximize();
		
	}
	
	void FullName(WebDriver driver)
	{
		WebElement fullname=driver.findElement(By.xpath("//*[@maxlength='61']"));
		fullname.sendKeys("Dhawal Kale");
		
	}
	void EmailID(WebDriver driver)
	{
		WebElement email=driver.findElement(By.xpath("//*[@maxlength='30']"));
		email.sendKeys("Dhawal2140@");
	}
	
	void Password(WebDriver driver)
	{
		WebElement pass=driver.findElement(By.xpath("//*[@maxlength='14']"));
		pass.sendKeys("Dhawal@");
	}
	void rePassword(WebDriver driver)
	{
		WebElement repass=driver.findElement(By.xpath("//*[starts-with(@name,'confirm')]"));
		repass.sendKeys("Dhawal@");
	}
	void Alemail(WebDriver driver)
	{
		WebElement Alemail=driver.findElement(By.xpath("//*[@maxlength='100']"));
		Alemail.sendKeys("Dhawal@");
	}
	
	void MoboileNo(WebDriver driver)
	{
		WebElement mono=driver.findElement(By.xpath("//*[@id='mobno']"));
		mono.sendKeys("9960424790");
	}
	
	void Day(WebDriver driver)
	{
		WebElement day=driver.findElement(By.xpath("//*[text()='Day']"));
		day.click();
		Select obj=new Select(day);
		obj.selectByValue("14");
		
	}

	void Month(WebDriver driver)
	{
		WebElement month=driver.findElement(By.xpath("//*[text()='Month']"));
		month.click();
		Select obj=new Select(month);
		obj.selectByValue("03");
		
	}

	void Year(WebDriver driver)
	{
		WebElement year=driver.findElement(By.xpath("//*[@name='DOB_Year867e4d9c']"));
		year.click();
		Select obj=new Select(year);
		obj.selectByValue("2022");
		
	}
	
	void Gender(WebDriver driver)
	{
		WebElement gender=driver.findElement(By.xpath("//*[@value='f']"));
		gender.click();
		
     }
	void City(WebDriver driver)
	{
		WebElement city=driver.findElement(By.xpath("//*[@name='city867e4d9c']"));
		city.click();
		Select obj=new Select(city);
		obj.selectByValue("Nagpur");
		
     }
	
	void text(WebDriver driver)
	{
		WebElement text=driver.findElement(By.xpath("//*[@class='captcha']"));
		text.sendKeys("Dhawal Kale");
		
    }
	
	
	
	
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/SHIV/Downloads/chromedriver_win32/chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	 
	     AssigmentRegistorPage obj=new AssigmentRegistorPage();
	     driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	     obj.OpWebPage(driver);
	     obj.FullName(driver);
	    obj.EmailID(driver);
	   obj.Password(driver);
	   obj.rePassword(driver);
	    obj.Alemail(driver);
	    obj.MoboileNo(driver);
	     obj.Day(driver);
	     obj.Month(driver);
	    obj.Year(driver);
	    obj.Gender(driver);
	    obj.City(driver);
	    obj.text(driver);
	     
	     
	     
	    
	  
	     
	     
	

	}

}
