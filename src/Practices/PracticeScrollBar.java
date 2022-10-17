package Practices;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class PracticeScrollBar {
	
	
	void opWebPage(WebDriver driver) 
	{
		String url="https://www.redbus.in/";
		driver.navigate().to(url);
		driver.manage().window().maximize();
		
	}
	
	void Select(WebDriver driver)
	{
		WebElement click=driver.findElement(By.linkText("Parveen Travels"));
		click.click();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0]", "click");
		
	}

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/SHIV/Downloads/chromedriver_win32/chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	     PracticeScrollBar obj=new PracticeScrollBar();
	     obj.opWebPage(driver);
	     obj.Select(driver);
	}

}
