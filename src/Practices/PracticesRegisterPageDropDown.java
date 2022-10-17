package Practices;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticesRegisterPageDropDown {
	
	void OpWebPage( WebDriver driver)

	{
		String url="http://register.rediff.com/register/register.php?FormName=user_details";
		driver.navigate().to(url);
		driver.manage().window().maximize();
		
	}
	
	void click(WebDriver driver)
	{
		WebElement click=driver.findElement(By.xpath("//*[@id='country']"));
		click.click();
		
		
		
				
		
		List<WebElement> hotel=driver.findElements(By.xpath("//*[contains(@onchange,'showHidecity();fieldTrack(this);checkIsdExists();')]"));
		
		for(WebElement x:hotel)
		{
			System.out.println(x.getText());
		}
	}
		
		void MethodTwo(WebDriver driver)

		{
			WebElement MethodTwo=driver.findElement(By.xpath("//*[@class='captcha']"));
			MethodTwo.click();
		}
	
		
		
	
	
	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/SHIV/Downloads/chromedriver_win32/chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	     PracticesRegisterPageDropDown obj=new PracticesRegisterPageDropDown();
	     obj.OpWebPage(driver);
	     obj.click(driver);
	     obj.MethodTwo(driver);
	     

	}

}
