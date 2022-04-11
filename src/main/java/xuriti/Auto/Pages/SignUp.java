package xuriti.Auto.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUp {
	
WebDriver driver;
	
	public SignUp(WebDriver driver) {
		this.driver=driver;
	}
	
	public void Details (String FirstName,String LastName, String Mobile) throws InterruptedException {
	
		Thread.sleep(5000);
		
	driver.findElement(By.linkText("Sign Up")).click();   //Sign Up
	
	driver.manage().window().maximize();
	
	Thread.sleep(3000);
	
	driver.findElement(By.id("mat-input-2")).sendKeys(FirstName); //FirstName
	
	Thread.sleep(3000);
	
	driver.findElement(By.id("mat-input-3")).sendKeys(LastName); //LastName
	
	Thread.sleep(3000);
	
	driver.findElement(By.id("mat-input-4")).sendKeys(Mobile); //MobileNo
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//*[@id=\"setMobileno\"]/form/div[3]/button")).click(); //Send OTP
	
}
	
	}



