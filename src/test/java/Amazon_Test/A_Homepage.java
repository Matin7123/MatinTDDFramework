package Amazon_Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Baseclass;
import pages.UtilityClass;
import pages.pom_page;

public class A_Homepage extends Baseclass {
	pom_page pg ;

	
	@BeforeClass
	public void OpenBrowser() throws InterruptedException, IOException 
	{
	
		initilizebrowser();
  
		pg = new pom_page(driver);
	}
	
	
	//Verifying Title of the Page
	@Test(priority = 1)
	public void homepages() throws EncryptedDocumentException, IOException {
		
		String title = pg.getTitle();  
		
		boolean str = title.contains(UtilityClass.TestData(0, 0));
		Assert.assertTrue(str);
	}
	
	
	//Verifying Buy Product Procedure
	@Test(priority = 2)
	public void ByIphones() throws EncryptedDocumentException, IOException, InterruptedException {
		
		pg.searchBox(UtilityClass.TestData(0, 1));
		pg.Buyiphone();
		
		pg.EnterEmail(UtilityClass.TestData(0, 2));
		pg.Enterpassword(UtilityClass.TestData(0, 3));
		
	}
	
	
	@AfterClass
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
	
	
}
