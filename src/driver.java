
import org.openqa.selenium.chrome.ChromeDriver;

public class driver {

	public static void main(String[] args) {
	
		
		
		System.setProperty("webDriver.Chrome.driver", "/Users/SHIV/Downloads/chromedriver_win32/chromedDriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		

	}

}
