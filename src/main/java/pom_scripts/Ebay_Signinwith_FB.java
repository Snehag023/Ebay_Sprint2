package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Ebay_Signinwith_FB extends BasePage
{

	public Ebay_Signinwith_FB(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath = "//a[text()='Sign in']")
    WebElement signin;
	public void clickonSignin() {
		clickAction(signin);
	}
	@FindBy(xpath = "//button[text()='Continue with Facebook']")
	WebElement facebook;
	public void continuewith_FB() {
		clickAction(facebook);
	}
	@FindBy(name = "email")
	WebElement fbemail;
	public void enterfBEmail(String email) {
		enter_value(fbemail, email);
	}
	@FindBy(id = "pass")
	WebElement fbpassword;
	public void enterFBPassword(String FBpassword) {
		enter_value(fbpassword, FBpassword);
	}
	@FindBy(id = "loginbutton")
	WebElement submitData;
	public void clickOnSubmit() {
		clickAction(submitData);
	}
}
