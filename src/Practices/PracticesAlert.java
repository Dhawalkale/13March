package Practices;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticesAlert {
	
	
	void OpwebPage( WebDriver driver)
	{
		String url="https://demoqa.com/alerts";
		driver.navigate().to(url);
		driver.manage().window().maximize();
	}
	
	void ClickButton1( WebDriver driver) throws InterruptedException
	{
		WebElement Click1=driver.findElement(By.xpath("//*[@id='alertButton']"));
	    Click1.click();
	    driver.switchTo().alert().accept();
	    
	}
	
	void ClickButton2( WebDriver driver) throws InterruptedException
	{
		WebElement Click2=driver.findElement(By.xpath("//*[contains(@id,'confirmButton')]"));
	    Click2.click();
	    driver.switchTo().alert().accept();
	   
	}
	
	void ClickButton3( WebDriver driver) throws InterruptedException
	{
		WebElement Click3=driver.findElement(By.xpath("//*[@id='promtButton']"));
	    Click3.click();
	    driver.switchTo().alert().accept();
	    
	}
	void ClickButton4( WebDriver driver) throws InterruptedException
	{
		WebElement Click4=driver.findElement(By.id("timerAlertButton"));
		 Click4.click();
	   
	    driver.switchTo().alert().accept();
	    Click4.click();
	    
	   
	    
	   
	    
	    
	}
	
	
	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/SHIV/Downloads/chromedriver_win32/chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     PracticesAlert obj=new PracticesAlert();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	     obj.OpwebPage(driver);
	   obj.ClickButton1(driver);
	   obj.ClickButton2(driver);
	     obj.ClickButton3(driver);
	    obj.ClickButton4(driver);

	     
	     
	}

}
