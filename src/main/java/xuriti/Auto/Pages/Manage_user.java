package xuriti.Auto.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Manage_user {
WebDriver driver;
	
	public Manage_user(WebDriver driver) throws InterruptedException {
		this.driver=driver;
		
		 //switch company
//		Thread.sleep(3000);
//		 driver.findElement(By.xpath("/html/body/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/app-sidebar/div/div[1]/div[2]/div[2]/mat-nav-list/mat-list-item/div/div[2]")).click(); 
//		driver.findElement(By.className("mat-list-text")).click();  //switch company
		
        Thread.sleep(9000);
//        click on comapany name
//        driver.findElement(By.xpath("//*[@id=\"companylist-page\"]/div/div/div/div/div[2]/mat-card/div/mat-card-header/div/mat-card-title")).clear();
         driver.findElement(By.xpath("//*[@id=\"companylist-page\"]/div/div/div/div/div[2]/mat-card/div/mat-card-header/div")).click();  
        
        Thread.sleep(3000);
        //manage user
        driver.findElement(By.xpath("/html/body/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/app-sidebar/div/div[1]/div[3]/mat-nav-list/mat-list-item[2]/div/div[2]")).click(); //Click on Manage user
        
        Thread.sleep(3000);
        //add user
        driver.findElement(By.xpath("//*[@id=\"users-page\"]/div/div/div/div/div/div[3]/button")).click(); //ADD User
        
        Thread.sleep(3000);
        //new user
        driver.findElement(By.xpath("//input[@value='new']")).click(); //New user
        
       
	}
	public void New_User(String FirstName,String LastName,String Email, String Mobile) throws InterruptedException {
		 Thread.sleep(5000);
            
		 driver.findElement(By.id("mat-input-17")).sendKeys(FirstName);
//        driver.findElement(By.id("mat-input-4")).sendKeys(FirstName);//FirstName
        
        Thread.sleep(3000);
        driver.findElement(By.id("mat-input-18")).sendKeys(LastName);
//        driver.findElement(By.id("mat-input-5")).sendKeys(LastName); //LastName
        
        Thread.sleep(5000);
        
        driver.findElement(By.id("mat-input-19")).sendKeys(Email);
//        driver.findElement(By.xpath("//*[@id=\"mat-input-6\"]")).sendKeys(Email);
      
       
        Thread.sleep(3000);
        
        driver.findElement(By.id("mat-input-20")).sendKeys(Mobile);
//        driver.findElement(By.id("mat-input-7")).sendKeys(Mobile); //Mobile
        
        Thread.sleep(3000);
        
          driver.findElement(By.xpath("//*[@id=\"mat-select-10\"]/div/div[2]/div")).click();
//        driver.findElement(By.xpath("//*[@id=\"mat-select-10\"]/div/div[2]")).click(); //select role in dropdown
      
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//*[@id=\"mat-option-16\"]/span")).click();
//        driver.findElement(By.xpath("//*[@id=\"mat-option-15\"]/span")).click(); //admin
        
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//*[@id=\"add-users-dialog\"]/div/div/div/div[3]/form/div[2]/button")).click(); //admin
        
       
}
	
}
