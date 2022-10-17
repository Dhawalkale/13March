package Practices;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeOyoHotel {
	
	void OpWebPage(WebDriver driver)
	{
		String Url="https://www.oyorooms.com/";
		driver.navigate().to(Url);
		driver.manage().window().maximize();
		//driver.switchTo().alert().accept();
		
		
	}
	void SearchBox(WebDriver driver)
	{
		WebElement Search=driver.findElement(By.xpath("//*[contains(@id,'autoComplete__home')]"));
		Search.sendKeys("Nagpur");
		
		
		List<WebElement> Hotel=driver.findElements(By.xpath("//*[contains(@class,'d-text16 geoSuggestionsList__locationName')]"));
		
		for(WebElement H:Hotel)
		{
			System.out.println(H.getText());
		
		}
		
	}
	
	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/SHIV/Downloads/chromedriver_win32/chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     PracticeOyoHotel obj=new PracticeOyoHotel();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	     obj.OpWebPage(driver);
	     obj.SearchBox(driver);
	}

}
