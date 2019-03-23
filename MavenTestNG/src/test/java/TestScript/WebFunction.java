package TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebFunction 
{

	@Test

	public void Check()
	{
	
System.setProperty("webdriver.chrome.driver", "C:\\jar\\chromedriver.exe");
		
		//System.setProperty("webdriver.gecko.driver", "path")


		  WebDriver  driver=new ChromeDriver();
			
		   driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		   driver.manage().window().maximize();
		   driver.findElement(By.cssSelector("#login1")).sendKeys("username1");
		
		 // driver.findElement(By.xpath("//*[@id='login1']")).sendKeys("username1");
		  driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Pass123");
		   
		   
		  // driver.findElement(By.name("proceed")).click();
		   
		   //driver.findElement(By.xpath("//*[@title='Sign in']")).click();
		   
		   
	}

}

	
	

