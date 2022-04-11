package xuriti.Auto.TestCases;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import xuriti.Auto.Pages.Create_Account;
import xuriti.Auto.Pages.HomePage;
import xuriti.Auto.Pages.Log_Out;
import xuriti.Auto.Pages.Login;
import xuriti.Auto.Pages.Manage_user;
import xuriti.Auto.Pages.OTP;
import xuriti.Auto.Pages.Register_Company;
import xuriti.Auto.Pages.SignUp;


public class TC_01_end_end_flow {
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
		su.Details( "Siddhi","Pawar","9763926686");
		
		System.out.println("Signed Up Successfully");
	}
	
	@Test
	public void test3() throws InterruptedException {
		OTP eo = new OTP(driver);
		eo.OTPManual("1234");
		System.out.println("OTP entered succefully");
	}
	
	@Test
	public void test4() throws InterruptedException {
		Create_Account ca=new Create_Account(driver);
		ca.EmailPass("siddhi@gmail.com","Siddhi@123");
		
		System.out.println("Account created succesfully");
	}
	@Test
	public void test5() throws InterruptedException {
		Login li=new Login(driver);
		li.doLoginEmailPass("siddhi@gmail.com","Siddhi@123");
		
		System.out.println("You have logged in succesfully");
	}
	@Test
	public void test6() throws InterruptedException {
		Register_Company rc=new Register_Company(driver);
		rc.Gst_No("27AABCI6363G3ZH");	
		rc.TAN_CIN("PDES03028F", "L21091KA2019OPC141331");
		System.out.println("Your Company registerd successfully");
	}
	@Test
	 public void test7() throws InterruptedException
	  {
		  Manage_user mu=new Manage_user(driver);
			//mu.Company_user();
			
			mu.New_User("Radha","Shinde","Radha123@gmail.com","8080630830");	
			
			System.out.println("User added successfully");
	  }
	@Test
	public void test8() throws InterruptedException {
		Log_Out lu= new Log_Out(driver);
		lu.end();
			
		System.out.println("Logged_out_successfully");
	}
	
	
}