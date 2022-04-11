package xuriti.Auto.TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import xuriti.Auto.Pages.HomePage;
import xuriti.Auto.Pages.Login;



public class TC_05_Login 
{
  WebDriver driver;
  @Test
  public void test1() 
  {
	  
	  HomePage hm = new HomePage(driver);
		driver=hm.lauchBrowser("chrome");
		hm.lauchApp();
		System.out.println("App launched successfully");
  }
  @Test
  public void test2() throws InterruptedException
  {
	  
			Login li=new Login(driver);
			li.doLoginEmailPass("varsha@gmail.com","Varsha@123");
			
			System.out.println("You have logged in succesfully");
  }	
}

