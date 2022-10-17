package Practices;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PracticeHandlingResize {
	void OpWebPage( WebDriver driver)
	{
		String url="https://demoqa.com/resizable";
		driver.navigate().to(url);
		driver.manage().window().maximize();
	}
	
	void Text(WebDriver driver)
	{
		WebElement text=driver.findElement(By.xpath("//*[@id='resizableBoxWithRestriction']"));
		String printText=text.getText();
		System.out.println(printText);
		
		
		
		Actions atc=new Actions(driver);
		
		WebElement drag=driver.findElement(By.xpath("//*[@id=\"resizableBoxWithRestriction\"]/span"));
	    atc.dragAndDropBy(drag,30, 60).build().perform();
		
				
		
	}
	
	
	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/SHIV/Downloads/chromedriver_win32/chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     PracticeHandlingResize obj=new PracticeHandlingResize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	     obj.OpWebPage(driver);
	     obj.Text(driver);
	    
	}

}
