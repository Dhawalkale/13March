package Practices;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PraticesNewWindowsHandling {
	
	private Object Childwindow;






	void OpWebPage(WebDriver driver)
	{
		String url="https://rahulshettyacademy.com/AutomationPractice/";
		driver.navigate().to(url);
		driver.manage().window().maximize();
	}
	void WindowHandling(WebDriver driver) throws InterruptedException
	{
		String mainHandling=driver.getWindowHandle();
		
		WebElement Button=driver.findElement(By.id("openwindow"));
		Button.click();
		
		Set<String> Window=driver.getWindowHandles();
		
		Iterator itr=Window.iterator();
		
		while(itr.hasNext())
		{
			String(Childwindow=itr.next());
			driver.manage().window().maximize();
			
			if(!mainHandling.equalsIgnoreCase("Childwindow"))
			{
			driver.switchTo().window("Childwindow");
			Thread.sleep(3000);
			
			WebElement grabText=driver.findElement(By.id("homepage"));
			String Text=grabText.getText();
			System.out.println("Text");
			
			
				
			}
		
			
			
		}
		
		
	}
	
	
	
	
	

	private void String(Object object) {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/SHIV/Downloads/chromedriver_win32/chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     PraticesNewWindowsHandling obj=new PraticesNewWindowsHandling();
	     obj.OpWebPage(driver);
	     obj.WindowHandling(driver);

	}

}
