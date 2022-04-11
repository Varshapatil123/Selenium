package xuriti.Auto.TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import xuriti.Auto.Pages.HomePage;
import xuriti.Auto.Pages.Login;
import xuriti.Auto.Pages.Register_Company;

public class TC_06_Register_Company 
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
	public void test2()throws InterruptedException
	{
		Login li=new Login(driver);
		li.doLoginEmailPass("varsha@gmail.com","Varsha@123");
		
		System.out.println("You have logged in succesfully");
	}
	
	@Test
	public void test3()throws InterruptedException
	{
		Register_Company rc=new Register_Company(driver);
		rc.Gst_No("20AABCU9603R1Z1");	
		rc.TAN_CIN("PDES03028F", "L21091KA2019OPC141331");
		System.out.println("Your Company registerd successfully");
	}
}
