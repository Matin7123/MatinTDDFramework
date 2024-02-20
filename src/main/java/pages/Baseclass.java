package pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Baseclass {

	public WebDriver driver;
	public void initilizebrowser(String Browsername) throws InterruptedException, IOException {
		
		
	
		
		if(Browsername.contains("chrome"))
		{
			
			driver= new ChromeDriver();
			Thread.sleep(1000);
			driver.get(UtilityClass.property_file("URL"));
		
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			driver.manage().window().maximize();
		
		}
		
		else if(Browsername.equalsIgnoreCase("edge")) {
			
			driver=new EdgeDriver();
			Thread.sleep(1000);
			driver.get(UtilityClass.property_file("URL"));
			
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			driver.manage().window().maximize();
			}
		
		
		else if(Browsername.equalsIgnoreCase("Firefox")) {
			
			driver= new FirefoxDriver();
			Thread.sleep(1000);
			driver.get(UtilityClass.property_file("URL"));
			
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			driver.manage().window().maximize();
			
			}
		}
	
	
}
