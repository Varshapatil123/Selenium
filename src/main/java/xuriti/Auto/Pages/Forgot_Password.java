package xuriti.Auto.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Forgot_Password {
		WebDriver driver;
	
public Forgot_Password(WebDriver driver) {
		this.driver=driver;
}

public void ForPassEmail (String userEmail) throws InterruptedException {
		Thread.sleep(5000);
	driver.findElement(By.linkText("Forgot Password?")).click();
	Thread.sleep(5000);
	driver.findElement(By.id("mat-input-2")).sendKeys(userEmail); //Email
	Thread.sleep(5000);
	driver.findElement(By.className("mat-button-wrapper")).click(); //Send Recovery link
}
}
 