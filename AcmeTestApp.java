package week1.day5;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Keys;

public class AcmeTestApp {
public static void main(String[] args) throws InterruptedException {

		//Launch the browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		// to launch the URL
		driver.get("https://acme-test.uipath.com/account/login");
		
		// Implicitly wait for 10 seconds
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		//To keyin the username
		driver.findElementById("email").sendKeys("kumar.testleaf@gmail.com");
		
		//do tab function
		driver.findElementById("email").sendKeys(Keys.TAB);
		
		//tokeyin the password
		driver.findElementById("password").sendKeys("leaf@12");
		
		// Click on the Login button
		driver.findElementById("buttonLogin").click();
		
		//Mouse hover
		WebElement ele = driver.findElementByXPath("//button[text()[normalize-space()='Vendors']]");  
		Actions hover = new Actions(driver);  
		hover.moveToElement(ele).perform();
		
		//Click on the search vendor
		driver.findElementByLinkText("Search for Vendor").click();
		
		// Key in the vendor name
		driver.findElementById("vendorName").sendKeys("Blue Lagoon");
		
		// Click on the search button
		driver.findElementById("buttonSearch").click();
		
		// // Find the country name
		String countryname = driver.findElementByXPath("//td[text()='France']").getText();
		System.out.println(countryname);
		
		// Click Logout
		driver.findElementByLinkText("Log Out").click();
				
		// CLose the browser
		driver.close();
		
		
		
	}
	
}
