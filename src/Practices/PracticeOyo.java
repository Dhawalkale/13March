package Practices;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class PracticeOyo {

	
		void WebPageOp( WebDriver driver)
		{
			String url="https://www.agoda.com/en-in/region/oyo-state-ng.html?device=c&network=g&adid=576976080714&rand=6361488525639494827&expid=&adpos=&aud=kwd-528989806981&site_id=1891440&tag=1c4a0edc-331b-4377-9ce9-354e093427a8&gclid=CjwKCAjwp7eUBhBeEiwAZbHwkfDhqiGK2v7Yb80LA5Bnn98yrvT0qpEF_e-ccZEKTZ0SzkCtfhrBzRoCTOMQAvD_BwE";
			driver.navigate().to(url);
			driver.manage().window().maximize();
			
		}
		void SearchBox( WebDriver driver)
		{
			WebElement Search=driver.findElement(By.xpath("//*[@aria-label='Enter a destination or property']"));
			Search.sendKeys("Nagpur");
			
			
			List<WebElement> Hotel=driver.findElements(By.xpath("//*[@class='Suggestion__text']"));
			
			for(WebElement H:Hotel)
			{
				System.out.println(H.getText());
			}
		}
		
		void Search(WebDriver driver)
		{
			WebElement Search=driver.findElement(By.xpath("//*[@class='Searchbox__searchButton__text']"));
			Search.click();
		}
		
		
		
		
		
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "/Users/SHIV/Downloads/chromedriver_win32/chromedriver.exe");
		     WebDriver driver=new ChromeDriver();
		     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		     PracticeOyo  obj=new PracticeOyo ();
		     obj.WebPageOp(driver);
		     obj.SearchBox(driver);
		     obj.Search(driver);
		     
		     
		     

	}

}
