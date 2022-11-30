package test_Scripts;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic.Base_Test;
import generic.ReadExcel;
import pom_scripts.Ebay_Register1;

public class Ebay_Register_Personal_Acc extends Base_Test {
@Test(dataProvider="testData")
public void testScript1(String[]testData)throws IOException {
	Ebay_Register1 eb=new Ebay_Register1(driver);
    eb.clickonRegister();
    eb.clickonPersonalacc();
    eb.enter_firstname(testData[0]);
    eb.enter_lastname(testData[1]);
    eb.enter_email(testData[2]);
    eb.enter_password(testData[3]);
    eb.click_on_login();
}
@DataProvider(name ="testData")
public Object[][] getTestData() throws IOException {
	Object [][]testdata=ReadExcel.getMultipleData("register1");
	return testdata;
}
}