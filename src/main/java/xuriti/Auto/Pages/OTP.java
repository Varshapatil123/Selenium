package xuriti.Auto.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OTP {
	
	 WebDriver driver;
	
	public OTP(WebDriver driver) {
		this.driver=driver;
	}

public void OTPManual(String OTP) throws InterruptedException  {
	Thread.sleep(5000);
	driver.findElement(By.id("mat-input-5")).sendKeys(OTP);
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id=\"otp_verification\"]/form/div[3]/button")).click();  //Verify
	
	}

}