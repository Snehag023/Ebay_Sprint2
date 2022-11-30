package test_Scripts;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic.Base_Test;
import generic.ReadExcel;
import pom_scripts.Ebay_Register1;
import pom_scripts.Ebay_Register2;

public class Ebay_Register_Businessacc extends Base_Test {
@Test(dataProvider="testData")
public void testScript2(String []testData) {
	
	Ebay_Register2 er=new Ebay_Register2(driver);
	Ebay_Register1 eb=new Ebay_Register1(driver);
	eb.clickonRegister();
	er.Help();
	er.Help1();
	er.Help2();
	er.Help3(testData[0]);
	er.click_on_Send();
	er.click_on_Businessacc();
	er.enter_businessname(testData[1]);
	er.enter_Email(testData[2]);
	er.enter_pwd(testData[3]);
	er.dropdown();
	er.ClickOnCheckbox();
	er.click();
}
@DataProvider(name ="testData")
public Object[][] getTestData() throws IOException {
	Object [][]testdata=ReadExcel.getMultipleData("Register2");
	return testdata;
}
}	