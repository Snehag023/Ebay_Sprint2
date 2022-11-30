package pom_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Ebay_Register2 extends BasePage{

	public Ebay_Register2(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(id = "ifhItem0")
	WebElement help;
	public void Help() {
		clickAction(help);
	}
	@FindBy(id = "ifhOverlayClose")
    WebElement help1;
	public void Help1() {
		clickAction(help1);
	}
    @FindBy(xpath ="//img[@alt='Experiencing issues?']")
    WebElement helpfeature;
    public void Help2() {
    	clickAction(helpfeature);
    }
    @FindBy(id = "ifhTextArea_0")
    WebElement help3;
    public void Help3(String Help) {
    enter_value(help3, Help);
    }
    @FindBy(xpath = "//button[text()='Send']")
    WebElement send;
    public void click_on_Send() {
    	clickAction(send);
    	}
    @FindBy(id = "businessaccount-radio")
    WebElement businessacc;
    public void click_on_Businessacc() {
    	clickAction(businessacc);
    }
    @FindBy(name = "businessName")
    WebElement businessnameTF;
    public void enter_businessname(String Bname) {
   enter_value(businessnameTF, Bname);
    	}
    @FindBy(id = "businessEmail")
    WebElement businessEmailTF;
    public void enter_Email(String BEmail) {
    	enter_value(businessEmailTF, BEmail);
    }
    @FindBy(name = "bizPassword")
    WebElement businesspwdTF;
    public void enter_pwd(String Bpwd) {
    	enter_value(businesspwdTF, Bpwd);
    	}
    @FindBy(tagName = "select")
    WebElement dropdown;
    public void dropdown() {
   Select select=new Select(dropdown);
	select.selectByVisibleText("India");
    }
    @FindBy(name = "bizOnlyToBuy")
    WebElement checkbox;
    public void ClickOnCheckbox() {
    clickAction(checkbox);	
    }
    @FindBy(name = "BUSINESS_REG_FORM_SUBMIT")
    WebElement click;
    public void click() {
    	clickAction(click);
    }
    
}

