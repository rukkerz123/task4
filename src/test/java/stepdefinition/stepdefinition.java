package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import baseclass.baseclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pomclass.pomclass;

public class stepdefinition extends baseclass {

	@Given("User searches the IRCTC website.")
	public void user_searches_the_irctc_website() {
		launchbrowser();
		launchurl("https://www.makemytrip.com/railways/irctc-create-account.html");
	   
	}
	@When("user click the Irctc login page.")
	public void user_click_the_irctc_login_page() throws InterruptedException {
		PageFactory.initElements(driver, pomclass.class);
		username(pomclass.username, "Venkat@1997");
		Emailaddress(pomclass.Emailaddress, "kamalasri2018@gmail.com");
		mobilenumber(pomclass.mobilenumber, "9790697412");
		password(pomclass.password, "Rukkerz@123");
		securityquestion(pomclass.securityquestion, 2);
	
		 
	}
	@When("user enter the contact details and click the continue button.")
	public void user_enter_the_contact_details_and_click_the_continue_button() throws InterruptedException {
		securityanswer(pomclass.securityanswer, "my childhood hero name is vijay");
		firstname(pomclass.firstname, "kamala");
		lastname(pomclass.lastname, "sridhar");
		Thread.sleep(2000);
		click(pomclass.dateofbirth);
		Thread.sleep(1500);
		click(pomclass.month);
		Thread.sleep(2000);
		click(pomclass.year);
		Thread.sleep(2000);
		click(pomclass.date);
	}
	
	@When("User enter all the irctc login details and click the continue button.")
	public void user_enter_all_the_irctc_login_details_and_click_the_continue_button() throws InterruptedException {
		Thread.sleep(2000);
		occupation(pomclass.occupation, 2);
		preferredlanguage(pomclass.preferredlanguage, 1);
		residentialaddress(pomclass.residentialaddress, "xyz block chennai-45");
		mobilenumber(pomclass.mobilenumber1, "9790697412");
		
	   
	}
	@When("User enter the Address details and click the create account button.")
	public void user_enter_the_address_details_and_click_the_create_account_button() throws InterruptedException {
		countryresidence(pomclass.countryofresidence, 0);
		pincode(pomclass.pincode, "620005");
		
		
	   
	}
	@Then("the next page should be generated.")
	public void the_next_page_should_be_generated() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Create Account']")).click();
	}




	}


