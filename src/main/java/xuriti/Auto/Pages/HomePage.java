package xuriti.Auto.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriverException;
//import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class HomePage {
	WebDriver driver;
	public HomePage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	public WebDriver lauchBrowser(String browser) {		
		System.setProperty("webdriver.chrome.driver", 
				"chromedriver");
		driver=new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
		options.addArguments("disable-infobars"); // disabling infobars
	    options.addArguments("--disable-extensions"); // disabling extensions
		options.addArguments("--disable-gpu"); // applicable to windows os only
		options.addArguments("--no-sandbox"); // Bypass OS security model
		WebDriver driver = new ChromeDriver(options);
//		driver.get("http://localhost:4200/#/");
//		
		
//		try {
//			if(browser.equalsIgnoreCase("chrome")) {
//				System.setProperty("webdriver.chrome.driver", 
//						"chromedriver.exe");
//				
//				driver =new ChromeDriver();
//			}
//			else if(browser.equalsIgnoreCase("firefox")) {
//				System.setProperty("webdriver.gecko.driver", 
//						"geckodriver.exe");
//				driver =new FirefoxDriver();
//			}				
//		}
//			catch(WebDriverException e) {
//			e.printStackTrace();
//		}
	return driver;
		
	}
	
	public void lauchApp() {
		try {
			driver.get("http://localhost:4200/#/");
			
			//driver.get("https://uat.xuriti.com/#/");
				
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.manage().window().fullscreen();
		
		driver.findElement(By.className("mat-button-wrapper")).click(); //Get started
	}

	}

