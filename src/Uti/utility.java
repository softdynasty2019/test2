package Uti;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class utility {
	
	
	
	public static void SelectCalender(WebDriver driver,String month,String date) {

		String Expectedmonth = month;

		while (!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText()
				.contains(Expectedmonth)) {// (!) means Logical Not

			driver.findElement(By.cssSelector("[class=' table-condensed'] [class='next']")).click();

		}

		// For Date Selection
		List<WebElement> dates = driver.findElements(By.cssSelector(".day"));// Select All Cal

		int count = driver.findElements(By.cssSelector(".day")).size();// 42

		for (int i = 0; i < count; i++) {

			String Day = date;

			String text = driver.findElements(By.cssSelector(".day")).get(i).getText();// 28

			// System.out.println(text);

			if (text.equalsIgnoreCase(Day)) {

				driver.findElements(By.cssSelector(".day")).get(i).click();
				break;

			}

		}

		
	}

}
