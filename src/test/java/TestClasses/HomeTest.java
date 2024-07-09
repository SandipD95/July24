package TestClasses;

import org.testng.annotations.Test;

import util.BaseUtil;

public class HomeTest extends BaseUtil{

	
	@Test
	public void login()
	{
		
		System.out.println(driver.getTitle());
	}
}
