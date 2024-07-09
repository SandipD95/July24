package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class BaseUtil {
public static WebDriver driver;
	
@BeforeMethod(enabled=true)
	void baseMethod()
	{
		System.setProperty("webdriver.chrome.driver","D:\\software\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
//		driver.get("https://money.rediff.com/indices/bse");
		//driver.get("https://www.facebook.com/login/");
		driver.get("https://demoqa.com/elements");
		}
	@AfterMethod(enabled=false)
	public void tearDown()
	{
		driver.close();
	}
	@Test()
	public void t()
	{
	System.out.println(driver.getCurrentUrl());	
	}

}
