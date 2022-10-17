package Practices;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PracticesDargAndDrop {
	
	void OpWebPage( WebDriver driver)
	{
		String url="https://jqueryui.com/droppable/";   
		driver.navigate().to(url);
		driver.manage().window().maximize();
	}
	
	
	void Select( WebDriver driver)
	{
		WebElement frame=driver.findElement(By.xpath("//*[@class='demo-frame']"));
		driver.switchTo().frame("frame");
	   
		
		
	Actions act=new Actions(driver);

		WebElement Elementone=driver.findElement(By.id("draggable"));
		frame.click();
		
		

		WebElement ElementTwo=driver.findElement(By.id("droppable"));
		frame.click();
		
		act.dragAndDrop(Elementone, ElementTwo).build().perform();
	}

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/SHIV/Downloads/chromedriver_win32/chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	     PracticesDargAndDrop obj=new PracticesDargAndDrop();
	     obj.OpWebPage(driver);
	     obj.Select(driver);
	     

	}

}
