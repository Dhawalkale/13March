package Practices;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeCalender {
	
	
	void url(WebDriver driver)
	{
		String url="https://demoqa.com/date-picker";
		driver.navigate().to(url);
		driver.manage().window().maximize();
		
	}
	
	void calender(WebDriver driver)
	{
		WebElement Select=driver.findElement(By.id("datePickerMonthYearInput"));
		Select.click();
		
		
		
		while(!driver.findElement(By.xpath("//*[contains(@class,'react-datepicker__current-month react-datepicker__current-month--hasYearDropdown react-datepicker__current-month--hasMonthDropdown')]")).getText().equalsIgnoreCase("March 2023"))
				{
					WebElement Btn=driver.findElement(By.xpath("//*[@aria-label='Next Month']"));
					Btn.click();
					
				}
		
		List<WebElement> day=driver.findElements(By.xpath("//*[contains(@class,'react-datepicker__day react-datepicker')]"));
		
		
		for(WebElement date:day)
		{
			if(date.getText().equalsIgnoreCase("14"))
			{
				date.click();
			}
				
			
		}
		
	}

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/SHIV/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		PracticeCalender obj=new PracticeCalender();
		obj.url(driver);
		obj.calender(driver);
		

	}

}
