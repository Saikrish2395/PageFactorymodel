package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	WebDriver driver;
	
	public void passdriver(WebDriver driver1) 
	{
		this.driver=driver1;
		
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(name="username")
	WebElement UserName;
	
	@FindBy(name="password")
	WebElement PassWord;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement LoginButton;
	
	public void Login(String Username,String Password) {
		UserName.sendKeys(Username);
		PassWord.sendKeys(Password);
		LoginButton.click();
	}
}
