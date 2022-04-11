package xuriti.Auto.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Register_Company {
	WebDriver driver;
	public Register_Company(WebDriver driver) {
		this.driver=driver;
	}
	public void Gst_No(String GSTNo) throws InterruptedException {
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"home-page\"]/div/div/button")).click(); //register now
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("mat-input-10")).sendKeys(GSTNo);
//		driver.findElement(By.id("mat-input-2")).sendKeys(GSTNo);  //GST number
		
		Thread.sleep(7000);
		
		driver.findElement(By.xpath("//*[@id=\"buyer-page\"]/div/div[2]/div/form[1]/div[2]/div/button")).click(); //Get company details
		
		Thread.sleep(5000);
	
	}
	
	public void TAN_CIN (String TAN, String CIN) throws InterruptedException {
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("mat-input-11")).sendKeys(TAN); //TAN
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("mat-input-12")).sendKeys(CIN); //CIN
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"buyer-page\"]/div/div[2]/div[1]/form[2]/div[3]/div/div/button")).click();
		
		
			}
}
