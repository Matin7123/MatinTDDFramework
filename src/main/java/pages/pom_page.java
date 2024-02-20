package pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class pom_page {
	WebDriver driver;
	WebDriverWait wait;
	@FindBy(xpath = "//input[@placeholder='Search Amazon.in']") private WebElement inputsearch;
	@FindBy(xpath  ="//input[@id='nav-search-submit-button']") private WebElement searchbtn;
	@FindBy(xpath = "(//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal'])[1]") private WebElement Iphone;
	@FindBy(xpath = "/html/body/div[4]/div/div[3]/div[8]/div[8]/div/div[1]/div/div[1]/div/div/div[2]/div/div[2]/div/form/div/div/div[41]/div/div/span/span/input") private WebElement buynowbtn;
	@FindBy(xpath ="//input[@type='email']")private WebElement enteremail;
	@FindBy(xpath = "//input[@id='continue']") private WebElement continuebtn;
	@FindBy(xpath = "//input[@type='password']") private WebElement enterpassword;
	@FindBy(xpath = "//input[@id='signInSubmit']") private WebElement signIn;
	
	
	public pom_page(WebDriver driver) 
	{
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		 wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	}
	
	
	public String getTitle()
	{
		
		String titleofpage = driver.getTitle();
		
		return titleofpage;
		
	}
	
	
	public void searchBox(String productname)
	{
		
		inputsearch.sendKeys(productname);
		searchbtn.click();
		
	}
	
	
	public void Buyiphone() throws InterruptedException 
	{
		
		wait.until(ExpectedConditions.visibilityOf(Iphone));
		
		Iphone.click();
		Thread.sleep(3000);
		Set<String> window = driver.getWindowHandles();
		ArrayList<String> index = new ArrayList<String>(window);
		driver.switchTo().window(index.get(1));
		Thread.sleep(3000);
		buynowbtn.click();
		
		}
	
	
	public void EnterEmail(String email) 
	{
		
		enteremail.sendKeys(email);
		
		continuebtn.click();
	}
	
	
	public void Enterpassword(String passwords)
	{
		enterpassword.sendKeys(passwords);
		signIn.click();
		
	}
	
	
	

}
