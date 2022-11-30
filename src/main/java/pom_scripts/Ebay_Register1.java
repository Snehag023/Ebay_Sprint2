package pom_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ebay_Register1 extends BasePage{

	public Ebay_Register1(WebDriver driver) {
		super(driver);
	
	}
	@FindBy(xpath = "//a[text()='register']")
	WebElement register;
	public void clickonRegister() {
		clickAction(register);
		}
	@FindBy(name = "accountcreate")
	WebElement personalacc;
	public void clickonPersonalacc() {
	clickAction(personalacc);	
		}
    @FindBy(name = "firstname")
    WebElement firstnameTF;
    public void enter_firstname(String Fname) {
    enter_value(firstnameTF,Fname);
    	
    }
    @FindBy(id = "lastname")
    WebElement lastnameTF;
    public void enter_lastname(String Lname) {
    enter_value(lastnameTF, Lname);
    	}
    @FindBy(id = "Email")
    WebElement emailTF;
    public void enter_email(String Ename) {
    	enter_value(emailTF, Ename);
    }
    @FindBy(id = "password")
    WebElement passwordTF;
    public void enter_password(String Pwd) {
    	enter_value(passwordTF, Pwd);
    }
    @FindBy(id = "EMAIL_REG_FORM_SUBMIT")
    WebElement button;
    public void click_on_login() {
    clickAction(button);
    }
    
    
}


