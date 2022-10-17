package Practices;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticesAutoSuggestiveZomatoHotelList {
	








	void OpWebPage( WebDriver driver)
	{
		String url="https://www.zomato.com/";
		driver.navigate().to(url);
		driver.manage().window().maximize();
	}
	void SearchBox(WebDriver driver)
	{
		WebElement Serach=driver.findElement(By.xpath("//*[@placeholder='Search for restaurant, cuisine or a dish']"));
		Serach.sendKeys("pune");
		Serach.click();
	
		
		List<WebElement> hotel=driver.findElements(By.xpath("//*[starts-with(@class,'sc-1hez2tp-0 sc-fihHvN OKWCN')]"));
		
	  for(WebElement H:hotel)
	   {
		  if(H.getText().equalsIgnoreCase("Pune Ruchi"));
		  H.click();
		  
		
		}
		
		
		
		
	}
	
	
	
	
	
	
	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/SHIV/Downloads/chromedriver_win32/chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	     PracticesAutoSuggestiveZomatoHotelList obj=new PracticesAutoSuggestiveZomatoHotelList();
	     obj.OpWebPage(driver);
	     obj.SearchBox(driver);
	  

	}

}
