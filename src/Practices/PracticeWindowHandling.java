package Practices;

import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeWindowHandling {
	
	private String Childwindow;

	void OpWebPage(WebDriver driver)
	{
      String url="https://demoqa.com/browser-windows";
      driver.navigate().to(url);
      driver.manage().window().maximize();
      
	}
	
	void WindowHandling(WebDriver driver) throws InterruptedException
	{
		String mainWindow=driver.getWindowHandle();
		
		WebElement button=driver.findElement(By.id("windowButton"));
		
		button.click();
		
		Set<String>Windows =driver.getWindowHandles();
		java.util.Iterator<String> itr=Windows.iterator();
		while(itr.hasNext())
		{
			
			String(Childwindow=itr.next());
			driver.manage().window().maximize();
			
			if(!mainWindow.equalsIgnoreCase("Childwindow"))
			{
				driver.switchTo().window(Childwindow);
				Thread.sleep(3000);
				
				
				WebElement grabText=driver.findElement(By.id("sampleHeading"));
				
				String text=grabText.getText();
				System.out.println(text);
				
		     }
		
		
       
		
		
		
		
		}
	}

	private void String(String string) {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/SHIV/Downloads/chromedriver_win32/chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     PracticeWindowHandling obj=new PracticeWindowHandling();
	     obj.OpWebPage(driver);
	     obj.WindowHandling(driver);
	}

}
