package Practices;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticesFlipcard {
	
	void MethodOne(WebDriver driver)
	{
		String url ="https://www.flipkart.com/";
		driver.navigate().to(url);
		driver.manage().window().maximize();
		
	}
	
	
	

	void Serach(WebDriver driver)
	{
		WebElement search=driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
		search.sendKeys("apple Mobiles");
		
		
		
		List<WebElement> Mobile=driver.findElements(By.xpath("//*[contains(@class,'a-size-medium a-color-base a-text-normal')]"));
		for(WebElement M:Mobile)
		{
		 System.out.println(M.getText());
		}
		
		
		
		
     }
	
	
	
	
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/SHIV/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		PracticesFlipcard obj=new PracticesFlipcard ();
		obj.MethodOne(driver);
		//obj.Serach(driver);
	
	
	}  

}
