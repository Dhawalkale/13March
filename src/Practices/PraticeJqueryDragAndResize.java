package Practices;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PraticeJqueryDragAndResize {
	void OpWebPage( WebDriver driver)
	{
		String url="//https://jqueryui.com/resizable/";    //https://jqueryui.com/droppable/    //https://jqueryui.com/draggable/  //https://jqueryui.com/resizable/
		driver.navigate().to(url);
		driver.manage().window().maximize();
	}
	void Resize(WebDriver driver)
	{
		
		WebElement frame=driver.findElement(By.xpath("//*[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		
        Actions act=new Actions(driver);
		
		WebElement Resize=driver.findElement(By.xpath("//*[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
		
		act.dragAndDropBy(Resize, 80, 60).build().perform();
		
		
	}
	
	void DragAndDrop(WebDriver driver)
	{
		WebElement frame=driver.findElement(By.xpath("//*[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		
		Actions Act=new Actions(driver);
		WebElement drag=driver.findElement(By.id("draggable"));
		
		WebElement drop=driver.findElement(By.id("droppable"));
		
		Act.dragAndDrop(drag, drop).build().perform();
		
		
	}
	
	
	
	void Print(WebDriver driver)
	{
		WebElement frame=driver.findElement(By.xpath("//*[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		
		
		WebElement TextPrint=driver.findElement(By.id("resizable"));
		String text=TextPrint.getText();
		System.out.println(text);
		
	}
	
	
	
	
	
	
	
	
	

	
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/SHIV/Downloads/chromedriver_win32/chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	    
	     PraticeJqueryDragAndResize obj=new PraticeJqueryDragAndResize();
	     obj.OpWebPage(driver);
	      obj.Resize(driver);
          //obj.Print(driver);
          //obj.DragAndDrop(driver);
	}

}
