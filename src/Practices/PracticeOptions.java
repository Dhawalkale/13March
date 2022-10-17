package Practices;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class PracticeOptions {
	void openwebpage(  WebDriver driver)
	{
		String url="https://rahulshettyacademy.com/AutomationPractice/";
		driver.navigate().to(url);
		driver.manage().window().maximize();
		
	}
	
	void Opone(WebDriver driver) throws InterruptedException
	{
		WebElement opone=driver.findElement(By.xpath("//*[@id='checkBoxOption1' and @value='option1']"));
	
		opone.click();
		
		
	}
	
	void Optwo(WebDriver driver)
	{
		WebElement optwo=driver.findElement(By.xpath("//*[starts-with(@id,'checkBoxOption2')]"));
		 optwo.click();
	}
	
	
	void Opthree(WebDriver driver)
	{
		WebElement opthree=driver.findElement(By.xpath("//*[@id='checkBoxOption3' and @value='option3']"));
		 opthree.click();
	}

	
	void Drop1(WebDriver driver) throws InterruptedException
	{
		WebElement op1=driver.findElement(By.xpath("//*[@id='dropdown-class-example']"));
		 op1.click();
		 Select obj=new Select(op1);
		 obj.selectByValue("option1");
		
		 
	}

	void Drop2(WebDriver driver) throws InterruptedException
	{
		WebElement op2=driver.findElement(By.xpath("//*[@id='dropdown-class-example']"));
		 op2.click();
		 Select obj=new Select(op2);
		 obj.selectByValue("option2");
		 Thread.sleep(6000);
		 
	}
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/SHIV/Downloads/chromedriver_win32/chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     PracticeOptions obj=new PracticeOptions();
	     driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	     obj.openwebpage(driver);
	     obj.Opone(driver);
	     obj.Optwo(driver);
	     obj.Opthree(driver);
	     obj.Drop1(driver);
	     obj.Drop2(driver);
	   
	}

}
