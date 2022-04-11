package xuriti.Auto.TestCases;

	import org.openqa.selenium.WebDriver;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

import xuriti.Auto.Pages.HomePage;
import xuriti.Auto.Pages.Login_with_Google;

	

	public class TC_08_Login_with_google {
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
					Login_with_Google lg=new Login_with_Google(driver);
					lg.email("shree@gmail.com");	
					System.out.println("Login_with_google");
				}
		
	}
		
