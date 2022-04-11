package xuriti.Auto.TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import xuriti.Auto.Pages.HomePage;
import xuriti.Auto.Pages.Login;
import xuriti.Auto.Pages.Manage_user;

public class TC_07_Add_User 
{
  WebDriver driver;
  @ Test
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
	  Login li=new Login(driver);
		li.doLoginEmailPass("varsha@gmail.com","Varsha@123");
		
		System.out.println("You have logged in succesfully");
   }
  
  @Test
  public void test3() throws InterruptedException
  {
	  Manage_user mu=new Manage_user(driver);
		//mu.Company_user();
		
		mu.New_User("Radha","Shinde","Radha123@gmail.com","8080630830");	
		
		System.out.println("User added successfully");
  }
}
