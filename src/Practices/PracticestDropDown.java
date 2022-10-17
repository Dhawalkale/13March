package Practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class PracticestDropDown {
	
	
	void openWebPage(WebDriver driver)
	{

	
		String url="https://rahulshettyacademy.com/AutomationPractice/";
		driver.navigate().to(url);
		driver.manage().window().maximize();
		
	}
	void Option1(WebDriver driver)
	{
		WebElement option1=driver.findElement(By.xpath("//*[@id='dropdown-class-example']"));
		option1.click();
		Select obj=new Select(option1);
		obj.selectByValue("option1");
	}
		
		void Textbox(WebDriver driver)
		{
		WebElement textbox=driver.findElement(By.xpath("//*[@id='autocomplete' and @placeholder='Type to Select Countries']"));
		textbox.sendKeys("Dhawal kale");
		
		}
	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/SHIV/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		PracticestDropDown obj=new PracticestDropDown();
		obj.openWebPage(driver);
		obj.Option1(driver);
		obj.Textbox(driver);
		

	}

}
