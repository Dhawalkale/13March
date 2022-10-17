package Practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class PracticeQARadio {
	void openwedpage(WebDriver driver)
    {
		String url="https://demoqa.com/radio-button";
		driver.navigate().to(url);
		driver.manage().window().maximize();
		
   }
	
	void ButtonYes(WebDriver driver)
	{
		WebElement yes=driver.findElement(By.xpath("//*[@class='custom-control-label' and @for='yesRadio']"));
		yes.click();
		
     }
	
	
	void impreessive(WebDriver driver)
	{
		WebElement impreessive=driver.findElement(By.xpath("//*[starts-with(@for,'impressiveRadio')]"));
		
		impreessive.click();
		
     }
	

	void nobutton(WebDriver driver)
	{
		WebElement nobutton=driver.findElement(By.xpath("//*[@class='custom-control-label disabled' and @for='noRadio']"));
		if(nobutton.isEnabled())
		{
			nobutton.click();
			System.out.println("clicked");
		}
		else
		{
			System.out.println("not clik");
		}
		
		
     }
	
	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/SHIV/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 PracticeQARadio obj=new  PracticeQARadio();
		
		obj.openwedpage(driver);
		obj.ButtonYes(driver);
		obj.impreessive(driver);
		obj.nobutton(driver);
		
		
	}
}
