package xuriti.Auto.TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import xuriti.Auto.Pages.Create_Account;
import xuriti.Auto.Pages.HomePage;
import xuriti.Auto.Pages.OTP;
import xuriti.Auto.Pages.SignUp;

public class TC_04_Create_Account 
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
    public void test2()throws InterruptedException
    {
    	 SignUp su=new SignUp(driver);
 		su.Details( "Varsha","Patil","9763926686");
 		
 		System.out.println("Signed Up Successfully");
    }

    
    @Test
    public void test4()throws InterruptedException
    {
    	 OTP eo = new OTP(driver);
 		eo.OTPManual("1234");
 		System.out.println("OTP entered succefully");
    }
    
    @Test
	public void test5() throws InterruptedException {
		Create_Account ca=new Create_Account(driver);
		ca.EmailPass("varsha@gmail.com","Varsha@123");
		
		System.out.println("Account created succesfully");
	}
}

