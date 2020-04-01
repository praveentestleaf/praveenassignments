package week1day1assignment;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FACEBOOK {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		// Open chrome browser
		//chromedriver (is a class) > written by selenium team
		
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
    driver.findElementById("email").sendKeys("praveenn.park@gmail.com");
    
    driver.findElementById("pass").sendKeys("crmsfa");
    
    driver.findElementById("u_0_b").click();
    

	
	
	}

}