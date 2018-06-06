package testcase;

import java.awt.Dimension;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Applicationtest {
	    public String baseUrl = "http://demo.taxiappz.com/admin/login";
	    String driverPath = "D:/Software/Automation/geckodriver-v0.19.1-win64/geckodriver.exe";
	    public WebDriver driver ; 
	    
	    
	@BeforeTest
	 public void dolaunch(){
		System.setProperty("webdriver.gecko.driver", driverPath);
		driver.get(baseUrl);
	}
	
	@Test (priority=1)
	  public void doLogin(){
		driver.findElement(By.id("email")).sendKeys("vgbsv@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456789");
		driver.findElement(By.id("form")).click();
		
	}
	
	@AfterTest
	 public void close(){
		driver.close();
	}

}
