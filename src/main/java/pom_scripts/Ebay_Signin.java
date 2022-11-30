package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Ebay_Signin extends BasePage{

	public Ebay_Signin(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(partialLinkText = "Sign in")
	 WebElement signin;
	 public void clickOnSignin() {
	 clickAction(signin);
	}
    @FindBy(id = "userid")
    WebElement userid;
    public void enterUserID(String email) {
    	enter_value(userid, email);
    }
    @FindBy(name = "signin-continue-btn")
    WebElement  button;
    public void ClickOnContinueButton() {
    	clickAction(button);
    }
    @FindBy(id = "pass")
    WebElement password;
    public void enterPassword(String pwd) {
    enter_value(password, pwd);	
    }
     @FindBy(xpath = "//button[@type='submit']")
    WebElement submit;
    public void clickOnSubmit() {
    	clickAction(submit);
    }
    @FindBy(name = "webauthn-may-be-later")
    WebElement maybelater;
    public void maybelater(){
    	clickAction(maybelater);
    }
}
