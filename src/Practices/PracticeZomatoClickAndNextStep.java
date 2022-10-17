package Practices;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeZomatoClickAndNextStep {
	void OpWebPage(WebDriver driver)
	{
		String url="https://www.zomato.com/";
		driver.navigate().to(url);
		driver.manage().window().maximize();
		
		
		
	}
	
	
	void SearchBox(WebDriver driver)
	{
		WebElement Search=driver.findElement(By.xpath("//*[@placeholder='Search for restaurant, cuisine or a dish']"));
		Search.sendKeys("Chicken Dish");
		Search.click();
		
		
		List<WebElement> chicken=driver.findElements(By.xpath("//*[contains(@class,'sc-1hez2tp-0 sc-fihHvN OKWCN')]"));
		for(WebElement C:chicken)
		{
			
			
			
	
	if(C.getText().equalsIgnoreCase("Chicken Ishtu - Dine-out"))
	{
			C.click();
    }
		
	
		}
		
	
	}
	
	
	
	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/SHIV/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		PracticeZomatoClickAndNextStep obj=new PracticeZomatoClickAndNextStep();
		obj.OpWebPage(driver);
		obj.SearchBox(driver);
		

	}

}
