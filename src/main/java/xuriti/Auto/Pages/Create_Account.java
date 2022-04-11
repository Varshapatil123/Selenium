package xuriti.Auto.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Create_Account {
	
WebDriver driver;
	
	public Create_Account(WebDriver driver) {
		this.driver=driver;
	}	
		
	public void EmailPass(String Email,String Pass) throws InterruptedException {
		 			Thread.sleep(4000);  
			
		            driver.findElement(By.id("mat-input-6")).sendKeys(Email); //Email
			
		            Thread.sleep(3000);
	
		            driver.findElement(By.id("mat-input-7")).sendKeys(Pass); //Password
			   
		            Thread.sleep(2000);
//				driver.findElement(By.xpath("//*[@id=\"registration\"]/form/div[3]/button")).click();
		            driver.findElement(By.xpath("//*[@id=\"registration\"]/form/div[3]/button/span[1]")).click(); //Create
	}
}
