package xuriti.Auto.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login{
	WebDriver driver;
	public Login(WebDriver driver) {
		this.driver=driver;
	}


public void  doLoginEmailPass(String userEmail,String pass) throws InterruptedException{
	
	driver.manage().window().maximize();
	Thread.sleep(5000); 
//	driver.findElement(By.id("mat-input-0")).sendKeys(userEmail);
	driver.findElement(By.id("mat-input-8")).sendKeys(userEmail); //FirstName
	Thread.sleep(1000);
	
//	driver.findElement(By.id("mat-input-1")).sendKeys(pass);
	driver.findElement(By.id("mat-input-9")).sendKeys(pass); //LastName
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//*[@id=\"login-page\"]/div/div[2]/div[1]/div/form/div[4]/button/span[1]")).click(); //Login
	
			}
}
