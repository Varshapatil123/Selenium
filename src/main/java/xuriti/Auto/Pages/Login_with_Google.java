package xuriti.Auto.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_with_Google {
	WebDriver driver;
	public Login_with_Google(WebDriver driver) {
		this.driver=driver;
	}

	public void email(String useremail) throws InterruptedException {
		Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id=\"login-page\"]/div/div[2]/div[1]/div/div[2]/button")).click(); //enter emailid
	
	}
}
