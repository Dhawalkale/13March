import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProjectAssimentPage {
	
	void OpenWebPage(WebDriver driver)

	{
		String url="http://register.rediff.com/register/register.php?FormName=user_details";
		driver.navigate().to(url);
		driver.manage().window().maximize();
	}
	
	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/SHIV/Downloads/chromedriver_win32/chromedriver.ex");
	  WebDriver driver =new ChromeDriver();
	  ProjectAssimentPage obj=new ProjectAssimentPage();
	  obj.OpenWebPage(driver);
	  
	  
		
	

	

	}

}
