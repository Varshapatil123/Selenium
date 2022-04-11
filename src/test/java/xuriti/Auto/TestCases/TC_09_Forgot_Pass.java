package xuriti.Auto.TestCases;


import org.openqa.selenium.WebDriver;
//import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import xuriti.Auto.Pages.Forgot_Password;
import xuriti.Auto.Pages.HomePage;

public class TC_09_Forgot_Pass {
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
			Forgot_Password fp=new Forgot_Password(driver);
			fp.ForPassEmail( "siddhi@gmail.com");
			
			System.out.println("Recovery link sent successfully on your emailid");
		}
}