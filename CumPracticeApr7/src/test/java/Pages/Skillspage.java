package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Skillspage {

	WebDriver driver;
	
	public void passdriver(WebDriver driver1)
	{
		this.driver=driver1;
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//span[text()='Admin']")
	WebElement Admin;
	
	@FindBy(xpath="//span[text()='Qualifications ']")
	WebElement Qualifications;
	
	@FindBy(xpath="//a[text()='Skills']")
	WebElement Skills;
	
	 @FindBy(xpath="//button[text()=' Add ']")
	 WebElement Addbutton;
	 
	 @FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[2]")
	 WebElement SkillName;
	 
	 @FindBy(xpath="//textarea[ @placeholder='Type description here']")
	 WebElement SkillDesc;
	 
	 @FindBy(xpath="//button[text()=' Save ']")
	 WebElement Save;
	 
	 
	 public void NavigateSkills(){
		 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 Admin.click();
		 Qualifications.click();
		 Skills.click();
		 
	 }
	 
	 public void Addskills(String Skillname,String Skilldesc) 
	 {
		 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 
		 Addbutton.click();
		 SkillName.sendKeys(Skillname);
		 SkillDesc.sendKeys(Skilldesc);
		 Save.click();
		 
	 }
	 
}
