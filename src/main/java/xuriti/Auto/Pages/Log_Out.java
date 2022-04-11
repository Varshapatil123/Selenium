package xuriti.Auto.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

	public class Log_Out {
		    WebDriver driver;
		
	public Log_Out(WebDriver driver) {
			this.driver=driver;
	}
  public void end() throws InterruptedException {
	  Thread.sleep(5000); 
         driver.findElement(By.xpath("/html/body/app-root/app-layout/mat-sidenav-container/mat-sidenav-content/mat-toolbar/button[2]/span[1]/span")).click();
         
}
	}