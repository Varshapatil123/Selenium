package xuriti.Auto.TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import xuriti.Auto.Pages.HomePage;
import xuriti.Auto.Pages.Login;

public class TC_Login_10_Credentials {

	WebDriver driver;
	@BeforeMethod
	public void test1() {
						
		HomePage hm = new HomePage(driver);
		driver=hm.lauchBrowser("chrome");
		hm.lauchApp();
		System.out.println("App launched successfully");
	}
	@Test
	public void test2() throws InterruptedException {
		Login li=new Login(driver);
		li.doLoginEmailPass("san@..Gmail.com","1234@");
		
	}
	
//	public void test2() throws InterruptedException {
//		Login li=new Login(driver);
//		li.doLoginEmailPass("234587^%6@gmail.com","Shree@abc");
//	}
//	
//	public void test3() throws InterruptedException {
//		Login li=new Login(driver);
//		li.doLoginEmailPass("San<San@gmail.com>","Shree123456");
//	}
	
	
}
