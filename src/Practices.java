import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Practices {
	
	
	void OpOne(WebDriver driver)
	{
		String URL="https://rahulshettyacademy.com/AutomationPractice/";
		driver.get(URL);
	}
	
	void OpTwo(WebDriver driver)
	{
		WebElement RadioOne=driver.findElement(By.className("radioButton"));
		 RadioOne.click();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/SHIV/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 Practices obj=new  Practices();
		obj.OpOne(driver);
		obj.OpTwo(driver);
		

	}

}
