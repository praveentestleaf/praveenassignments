package week1.day5;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;


public class RedBusAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		
        ChromeDriver driver = new ChromeDriver();

		// Launch the red bus browser
		driver.get("https://www.redbus.in/");
		
		//Key in Chennai in from field
		driver.findElementById("src").sendKeys("Chennai",Keys.TAB);
		Thread.sleep(3000);
		
		//Key in Bangalore in To field
		driver.findElementById("dest").sendKeys("Bangalore",Keys.TAB);
		Thread.sleep(3000);
		
		// Select the date
		driver.findElementById("onward_cal").click();
		Thread.sleep(4000);
		driver.findElementByXPath("//div[@id='rb-calendar_onward_cal']/table[1]/tbody[1]/tr[7]/td[4]").click();
				
		// Click search buses
		driver.findElementById("search_btn").click();
				
		// Check "After 6pm" under Departure time
		driver.findElementByXPath("(//label[@for='dtAfter 6 pm'])[2]").click();
				
		//Check "Sleeper" under Bus Type
		driver.findElementByXPath("//label[@title='SLEEPER']").click();
				
		// Click on "Seats available"
		driver.findElementByXPath("//div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[7]/a[1]").click();
				
		// CLose the browser
		driver.close();
						
						
			}

		}