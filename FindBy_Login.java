package Learning;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FindBy_Login {
	
	@FindBy(how = How.XPATH, using = "//input[@placeholder = 'Username']")
	public static WebElement username;
	@FindBy(how = How.XPATH, using = "//input[@placeholder = 'Password']")
	public static WebElement password;
	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
	public static WebElement Loginbtn;
}
