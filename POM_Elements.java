package Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class POM_Elements {

	
		public static WebElement userName(WebDriver driver) {
			return driver.findElement(By.xpath("//input[@placeholder='Username']"));
			}
		public static WebElement password(WebDriver driver) {
			return driver.findElement(By.xpath("//input[@placeholder='Password']"));
			}
		public static WebElement loginButton(WebDriver driver) {
			return driver.findElement(By.xpath("//button[@type='submit']"));
			}
		
	}


