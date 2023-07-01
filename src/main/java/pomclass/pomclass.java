package pomclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class pomclass {
@FindBy(xpath = "//input[@ class='inputField  undefined']")
public static WebElement username;
@FindBy (xpath = "(//input[@class='inputField  undefined'])[2]")
public static WebElement Emailaddress ;
@FindBy (xpath = "//input[@ maxlength ='10']")
public static WebElement mobilenumber;
@FindBy(xpath = "//input[@placeholder = 'Type a password for your IRCTC account']")
public static WebElement password;
@FindBy(xpath = "(//select)[1]")
public static WebElement securityquestion;
@FindBy (xpath = "//input[@placeholder ='Type an answer for your security question']")
public static WebElement securityanswer;
@FindBy(xpath = "//input[@placeholder= 'Enter your first Name']")
public static WebElement firstname;
@FindBy (xpath = "//input[@placeholder= 'Enter your last Name']")
public static WebElement lastname;
@FindBy(xpath = "//input[@placeholder= 'Open calendar and select date']")
public static WebElement dateofbirth;

@FindBy(xpath = "(//select)[2]")
public static WebElement occupation;

@FindBy(xpath = "//label[@for= 'FEMALE']")
public static WebElement gender;
@FindBy (xpath = "//label[@for= 'MARRIED']")
public static WebElement martialstatus;
@FindBy(tagName = "select")
public static WebElement preferredlanguage;
@FindBy(xpath = "//input[@placeholder= 'Enter your residential address']")
public static WebElement residentialaddress;
@FindBy(xpath = "//input[@placeholder= 'Mobile Number']")
public static WebElement mobilenumber1;
@ FindBy(tagName = "select")
public static WebElement countryofresidence;
@FindBy(xpath = "//input[@placeholder= 'Enter your Pincode']")
public static WebElement pincode;
@FindBy(xpath = "//button[@class='blueButtonRails fullWidth append_bottom20']")
public static WebElement click;
@FindBy(xpath = "(//form/select/option[10])[1]")
public static WebElement month ;
@FindBy (xpath = "//form/select[2]/option[75]")
public static WebElement year ;
@FindBy(xpath = "(//div[@class='DayPicker-Day'])[9]")
public static WebElement date ;

	
	}


