package test_Scripts;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic.Base_Test;
import generic.ReadExcel;
import pom_scripts.Ebay_Signinwith_FB;
import pom_scripts.Ebay_Register1;

public class SigninWith_FB extends Base_Test {
	@Test(dataProvider="testData")
	public void testScript4(String []testData) {
		Ebay_Signinwith_FB fb=new Ebay_Signinwith_FB(driver);
		Ebay_Register1 eb=new Ebay_Register1(driver);
		        eb.clickonRegister();
				fb.clickonSignin();
				fb.continuewith_FB();
				fb.enterfBEmail(testData[0]);
				fb.enterFBPassword(testData[1]);
				fb.clickOnSubmit();
	}
	@DataProvider(name = "testData")
	public Object[][] getTestData() throws IOException {
		Object [][]testdata=ReadExcel.getMultipleData("FBData");
		return testdata;

}
}
