import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driverInvoke {

   public static  void main(String[] args) 
   {
	   System.setProperty("webdriver.chrome.driver", "/Selenium/src/chromedriver.exe"); 
	   WebDriver driver = new ChromeDriver();
	   driver.manage().deleteAllCookies();
       driver.get("https://www.facebook.com/");

	}
   
}
