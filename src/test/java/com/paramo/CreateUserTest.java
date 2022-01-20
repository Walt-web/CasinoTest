package com.paramo;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import junit.framework.Assert;

public class CreateUserTest {

	WebDriver driver;

	CreateUserPage createUserPage;

	@Before
	public void setUp() throws Exception {
		createUserPage = new CreateUserPage(driver);
		driver = createUserPage.chromeDriverConnection();
		createUserPage.visit("https://demo.casino/");
		driver.manage().window().maximize();
	}

	@After
	public void tearDown() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}

	@Test
	public void createUserTest() throws Exception {

		Assert.assertEquals("Demo Casino", driver.getTitle());
		createUserPage.clickBtnRegister();
		createUserPage.typeEmail();
		createUserPage.clickBoxTyC();
		Assert.assertEquals("Terms & Conditions", createUserPage.linksTyC());
		Assert.assertEquals("Data Policy", createUserPage.dataPolicy());
		Assert.assertEquals("Cookie Policy", createUserPage.cockieDataPolicy());
		createUserPage.typePassword();
		createUserPage.typeReenterPassword();
		createUserPage.typeCaptcha();
		createUserPage.typeLogin();
		createUserPage.typeName();
		createUserPage.typeLastName();
		createUserPage.typeMiddleName();
		createUserPage.cliclRedeemBonus();
		Assert.assertEquals("REGISTRATION BONUS", createUserPage.titleBonus());
		createUserPage.setBirthday();
		createUserPage.typeNickName();
		createUserPage.typeAddress();
		createUserPage.dropDownCountrys();
		createUserPage.typeCity();
		createUserPage.typePostalCode();
		createUserPage.selectGender();
		createUserPage.secretQuestion();
		createUserPage.submit();
		Assert.assertTrue(createUserPage.validatePasswordPostCreateFail());
		Assert.assertTrue(createUserPage.validateErrorCaptchaPostCreateFail());
		Assert.assertTrue(createUserPage.validateErrorNickNamePostCreateFail());
		
	}
	

}
