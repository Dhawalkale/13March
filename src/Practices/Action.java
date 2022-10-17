package Practices;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {
	
	void OpWebPage(WebDriver driver)
	{
		String url="https://jqueryui.com/resizable/";
		driver.navigate().to(url);
		driver.manage().window().maximize();
	}
	
	void  drag(WebDriver driver)
	{
		WebElement frame=driver.findElement(By.xpath("//*[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		
		
		Actions act=new Actions(driver);
		
		WebElement one=driver.findElement(By.xpath("//*[contains(@class,'ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se')]"));
		
		act.dragAndDropBy(one, 60, 80).build().perform();
				
	}
	

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/SHIV/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 Action obj=new  Action();
		 obj.OpWebPage(driver);
		 obj.drag(driver);
	}

}
