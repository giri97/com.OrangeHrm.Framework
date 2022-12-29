package com.OrangeHrm.Testcases;

import org.testng.annotations.Test;

import com.OrangeHrm.BaseTest.BaseClass;
import com.OrangeHrm.Pages.LoginPage;
import com.OrangeHrm.PropertyFile.PropertyFile;

public class LoginPageTest extends BaseClass {

	LoginPage loginpage;
	@Test
	public void verifyUserlogin() {

		loginpage=new LoginPage();
		loginpage.userLoginCredential(PropertyFile.getData("username"),PropertyFile.getData("password"));
		loginpage.clickOnLoginBtn();


}















}
