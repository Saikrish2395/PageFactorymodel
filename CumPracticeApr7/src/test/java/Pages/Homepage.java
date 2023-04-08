package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

	WebDriver driver;
	
	public void passdriver(WebDriver driver1) {
		this.driver=driver1;
		
		PageFactory.initElements(driver1,this);
	}
	
	@FindBy(xpath="//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")
	WebElement Welcome;
	
	@FindBy(xpath="//a[text()='Logout']")
	WebElement LogOut;
	
	public void Logout() {
		Welcome.click();
		LogOut.click();
	}
}
