package xuriti.Auto.TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import xuriti.Auto.Pages.HomePage;
import xuriti.Auto.Pages.SignUp;

public class TC_02_Signup 
{
	WebDriver driver;
	@Test
	public void test1() {	
		HomePage hm = new HomePage(driver);
		driver=hm.lauchBrowser("chrome");
		hm.lauchApp();
		System.out.println("App launched successfully");
	}
	@Test
	public void test2() throws InterruptedException {
		SignUp su=new SignUp(driver);
		su.Details( "Varsha","Patil","9763926686");
		
		System.out.println("Signed Up Successfully");
	}
	
}
