package Learning;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class POM_Login {

	@Test
	public void LoginPage() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		/************Using Page Object Model***************/
//		POM_Elements.userName(driver).sendKeys("Admin");
//		POM_Elements.password(driver).sendKeys("admin123");
//		POM_Elements.loginButton(driver).click();
		
		/**************Using Page Factory FindBY**************/
		
//		PageFactory.initElements(driver, FindBy_Login.class);
//			FindBy_Login.username.sendKeys("Admin");
//			FindBy_Login.password.sendKeys("admin123");
//			FindBy_Login.Loginbtn.click();
////		
//		

		/************* Without Using FindBy in the Page Factory method************/
			
		PageFactory.initElements(driver, WithoutFindBy.class);
		
	
	}

}
