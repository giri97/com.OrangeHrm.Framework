package com.OrangeHrm.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OrangeHrm.BaseTest.BaseClass;

public class LoginPage extends BaseClass {

	@FindBy(xpath="//input[@name='username']")
	private WebElement username;
	@FindBy(xpath="//input[@name='password']")
	private WebElement password;
	@FindBy(xpath="//button[text()=' Login ']")
	private WebElement Btn_login;


	public LoginPage() {
		PageFactory.initElements(driver,this);
	}

	public void userLoginCredential(String user,String pass) {
		
		username.sendKeys(user);
		password.sendKeys(pass);

	}

	public void clickOnLoginBtn() {
		Btn_login.click();
	}




}
