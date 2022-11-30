package test_Scripts;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic.Base_Test;
import generic.ReadExcel;
import pom_scripts.Ebay_Signin;

public class Ebay_signinTC extends Base_Test{
	@Test(dataProvider="testData")
	public void testScript3(String []testData) {
		Ebay_Signin es=new Ebay_Signin(driver);
		es.clickOnSignin();
		es.enterUserID(testData[0]);
		es.ClickOnContinueButton();
		es.enterPassword(testData[1]);
		es.clickOnSubmit();
		es.maybelater();
	}
	@DataProvider(name = "testData")
	public Object[][] getTestData() throws IOException {
		Object [][]testdata=ReadExcel.getMultipleData("SigninData");
		return testdata;

}
}
