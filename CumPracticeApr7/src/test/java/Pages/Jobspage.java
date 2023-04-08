package Pages;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.datatable.DataTable;

public class Jobspage {

	WebDriver driver;
	
	public void passdriver(WebDriver driver1) {
		this.driver=driver1;
		
		PageFactory.initElements(driver1,this);
	}
	
	
	@FindBy(xpath="//span[text()='Admin']")
	WebElement Admin;
	
	@FindBy(xpath="//span[text()='Job ']")
	WebElement Jobs;
	
	@FindBy(xpath="//a[text()='Job Titles']")
	WebElement JobTitles;
	
	@FindBy(xpath="//button[text()=' Add ']")
	WebElement AddButton;
	
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[2]")
	WebElement Jobtitle;
	
	@FindBy(xpath="//textarea[ @placeholder='Type description here']")
	WebElement Jobdesc;
	
	@FindBy(xpath="//textarea[@placeholder='Add note']")
	WebElement Jobnote;
	
	
	@FindBy(xpath="//button[text()=' Save ']")
	WebElement SaveButton;
	
	
	public void Addjobs(DataTable datatable) {
		List<Map<String, String>> Jobsdata=datatable.asMaps(String.class,String.class);
		
		for(int i=0;i<Jobsdata.size();i++) {
			
			String JobTitle=Jobsdata.get(i).get("JobTitle");
			String JobDesc=Jobsdata.get(i).get("JobDesc");
			String JobNote=Jobsdata.get(i).get("JobNote");
			
			Admin.click();
			Jobs.click();
			JobTitles.click();
			AddButton.click();
			
			Jobtitle.sendKeys(JobTitle);
			Jobdesc.sendKeys(JobDesc);
			Jobnote.sendKeys(JobNote);
			
			SaveButton.click();
		}
		
	}
	
}
