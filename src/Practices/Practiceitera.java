package Practices;



import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Practiceitera {
	
		
	


		void OpOne(WebDriver driver)
		{
			String URL="https://itera-qa.azurewebsites.net/home/automation";
			driver.get(URL);
			driver.manage().window().maximize();
		}
		
		void FirstName(WebDriver driver)
		{
			
				WebElement Fname=driver.findElement(By.xpath("//*[@id='name' and @class='form-control']"));
				Fname.sendKeys("Dhawal Kale");
		
			
			
			
		}
		
		void Moblieno(WebDriver driver)
		{
			WebElement moblieno=driver.findElement(By.xpath("//*[@id='phone'  or @placeholder='Enter your mobile phone']"));
			moblieno.sendKeys("9960424790");
		}
		
		void Email(WebDriver driver)
		{
			WebElement email=driver.findElement(By.xpath("//*[contains(@placeholder,'Enter email')]"));
			email.sendKeys("Dhawal2140@");
		}
		

		void Pass(WebDriver driver)
		{
			WebElement pass=driver.findElement(By.xpath("//*[@type='password']"));
			pass.sendKeys("Dhaw455");
		
			
			
		}
		
		void Address(WebDriver driver) 
		{
			WebElement address=driver.findElement(By.xpath("//*[starts-with(@id,'address')]"));
			address.sendKeys("Ashok Colony Amravati");
		
		}
		
		
		
		
		void drop(WebDriver driver)
		{
			WebElement drop=driver.findElement(By.xpath("//*[@class='custom-select']"));
			drop.click();
		Select obj=new Select(drop);
		obj.selectByIndex(5);
		
			
			
			
			
			}
			
			
			
		
		

		void Genderf(WebDriver driver)
		{
			WebElement gender=driver.findElement(By.xpath("//*[@id='female']"));
			gender.click();
			
		}

		void Genderm(WebDriver driver)
		{
			WebElement genderm=driver.findElement(By.xpath("//*[@id='male']"));
			genderm.click();
			
		}
		void others(WebDriver driver)
		{
			WebElement other=driver.findElement(By.xpath("//*[@id='other' and @value='option3']"));
			other.click();
			
			
		}
		
		void monday(WebDriver driver)
		{
			WebElement monday=driver.findElement(By.xpath("//*[contains(@id,'monday')]"));
			monday.click();
			
		}
		
		void Saturday(WebDriver driver) 
		{
			WebElement saturday=driver.findElement(By.xpath("//*[starts-with(@id,'saturday')]"));
			saturday.click();
			
			
		}
		void Year1(WebDriver driver)
		{
			WebElement year1=driver.findElement(By.xpath("//*[text()='1 year']"));
			year1.click();
			
		}
		
		void Year4(WebDriver driver)
		{
			WebElement year4=driver.findElement(By.xpath("//*[contains(@for,'4years')]"));
			year4.click();
			
			
			
		}
		
		
		
		
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "/Users/SHIV/Downloads/chromedriver_win32/chromedriver.exe");
		     WebDriver driver=new ChromeDriver();
		    
		     Practiceitera obj=new  Practiceitera();
		     obj.OpOne(driver);
		     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		    // obj.FirstName(driver);
		    // obj.Moblieno(driver);
		    // obj.Email(driver);
		    // obj.Pass(driver);
		      obj.drop(driver);
		   //  obj.Address(driver);
		    // obj.Genderf(driver);
		    // obj.Genderm(driver);
		   //  obj.others(driver);
		   //  obj.monday(driver);
		  //   obj.Saturday(driver);
		   //  obj.Year1(driver);
		   //  obj.Year4(driver);
		   
		     
		    

		}

	}



