package Practices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto {
	void OpWebPage(WebDriver driver)
	{
		String url="https://www.oyorooms.com/";
		driver.navigate().to(url);
		driver.manage().window().maximize();
	}
	void Method(WebDriver driver)
	{
		WebElement select=driver.findElement(By.id("autoComplete__home"));
		select.sendKeys("Amravati");
		
		List<WebElement> Hotel=driver.findElements(By.xpath("//*[contains(@class,'d-text16 geoSuggestionsList__locationName')]"));
		for(WebElement H:Hotel)
		{
		   System.out.println(H.getText());
			
			
		}
		
	}

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/SHIV/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		Auto obj=new Auto();
		obj.OpWebPage(driver);
		obj.Method(driver);
	}

}
