package Practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class PracticeRegistorPage {
	void OpenWebPage(WebDriver driver)
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
	 void Email(WebDriver driver)
	 {
		 WebElement email=driver.findElement(By.xpath("//*[@maxlength='30']"));
		 email.sendKeys("dhawal@");
	 }
	 void Password(WebDriver driver)
	 {
		 WebElement email=driver.findElement(By.xpath("//*[@maxlength='14']"));
		 email.sendKeys("Dhawal2140"); 
	 }
		
	 void RePassword(WebDriver driver)
	 {
		 WebElement rePassword=driver.findElement(By.xpath("//*[starts-with(@name,'confirm')]"));
		 rePassword.sendKeys("Dhawal2140"); 
	 }
	 void Alemail(WebDriver driver)
	 {
		 WebElement Alemail=driver.findElement(By.xpath("//*[@maxlength='100']"));
		 Alemail.sendKeys("Dhawal2140"); 
	 }

	 
	 void MoNo(WebDriver driver)
	 {
		 WebElement Mono=driver.findElement(By.xpath("//*[@id='mobno']"));
		 Mono.sendKeys("9960424790"); 
	 }
	 void gender(WebDriver driver)
	 {
		 WebElement female=driver.findElement(By.xpath("//*[@value='f']"));
		 female.click();
	 }
	 
	
		
	 
	 void City(WebDriver driver)
	 {
		 WebElement city=driver.findElement(By.xpath("//*[starts-with(@onchange,'showothcity();fieldTrack(this);')]"));
		 city.click();
	    Select obj=new Select(city);
	    obj.selectByValue("Nagpur");
	    
		 
		 
		 }
	 void Entry(WebDriver driver)
	 {
		 WebElement entry=driver.findElement(By.xpath("//*[@class='captcha']"));
		 entry.click();
	    
	 }
	 void Year(WebDriver driver)
	 {
		 WebElement Year=driver.findElement(By.xpath("//*[text()='Year']"));
		 Year.click();
		Select obj=new Select(Year);
	      obj.selectByVisibleText("2022");
	 }
	      
	      void Months(WebDriver driver)
	 	 {
	 		 WebElement months=driver.findElement(By.xpath("//*[text()='Year']"));
	 		 months.click();
	 		Select obj=new Select(months);
	 	      obj.selectByValue("JAN");
	 	      
	 	      
		 
		 
		 
	    
	  }
	 
	 

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/SHIV/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		PracticeRegistorPage obj=new PracticeRegistorPage();
		obj.OpenWebPage(driver);
		obj.FullName(driver);
		obj.Email(driver);
		obj.Password(driver);
		obj.RePassword(driver);
		obj.Alemail(driver);
		obj.MoNo(driver);
		obj.gender(driver);
		obj.Year(driver);
		obj.City(driver);
		obj.Entry(driver);
		obj.Months(driver);
		
	
		

	}

}



