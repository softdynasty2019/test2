package calender;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Uti.utility;

public class dynamicCalender {

	public static void main(String[] args) throws InterruptedException {
	
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Basement_PC\\Desktop\\Selenium\\Chrome driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.path2usa.com/travel-companions");
		driver.manage().window().maximize();
		driver.findElement(By.id("travel_date")).click();
		
		Thread.sleep(3000);
		
		utility.SelectCalender(driver, "August", "30");
		
		
		
		

	}

}
