package xuriti.Auto.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Main_LoginPage{
	WebDriver driver;
	public Main_LoginPage(WebDriver driver) {
		this.driver=driver;
	}


public void  EmailPass(String userEmail,String pass) throws InterruptedException{
	
	Thread.sleep(5000);
	
	driver.findElement(By.id("mat-input-0")).sendKeys(userEmail); //FirstName
	
	driver.findElement(By.id("mat-input-1")).sendKeys(pass); //LastName
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"login-page\"]/div/div[2]/div[1]/div/form/div[4]/button")).click(); //Login
	
			}
}
