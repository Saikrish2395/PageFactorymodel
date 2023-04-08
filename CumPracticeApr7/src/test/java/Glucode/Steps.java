package Glucode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.Homepage;
import Pages.Jobspage;
import Pages.Loginpage;
import Pages.Skillspage;
import io.cucumber.java.en.*;


public class Steps {

	
	WebDriver driver;
	
	@Given("User launch chrome browser")
	public void user_launch_chrome_browser() {
	    
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver(); 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		driver.manage().window().maximize() ;
		
		
	}
	
	
	@When("User opens URL {string}")
	public void user_opens_url(String TestUrl) {
	    
		driver.get(TestUrl);
		
	}
	
	
	
	@When("User enters username as {string} and password as {string}")
	public void user_enters_username_as_and_password_as(String UserName, String Password) {
	    Loginpage L1 =new Loginpage();
		L1.passdriver(driver);
		L1.Login(UserName, Password);
		
	}
	
	
	@Then("Go to Skill Page")
	public void go_to_skill_page() {
	    Skillspage S1 =new Skillspage();
		S1.passdriver(driver);
		S1.NavigateSkills();
		
	}
	
	
	@When("Add skills with skillname as {string} and skilldescription as {string}")
	public void add_skills_with_skillname_as_and_skilldescription_as(String SkillName, String SkillDesc) 
	{
	    
		Skillspage S2 =new Skillspage();
		S2.passdriver(driver);
		S2.Addskills(SkillName, SkillDesc);
		
	}
	
	
	@When("Click on logout button")
	public void click_on_logout_button() {
	    Homepage H1 =new Homepage();
		H1.passdriver(driver);
		H1.Logout();
	}
	
	
	@Then("Close Browser")
	public void close_browser() {
	    driver.close();
		
	}

	@Then("Enter jobs record with jobtitle, job decsand job note")
	public void enter_jobs_record_with_jobtitle_job_decsand_job_note(io.cucumber.datatable.DataTable dataTable) {
	    
		Jobspage J1 =new Jobspage();
		J1.passdriver(driver);
		J1.Addjobs(dataTable);
	}
	
}
