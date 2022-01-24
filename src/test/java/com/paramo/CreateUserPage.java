package com.paramo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/*
 * This class contains the locators of the elements that chromedriver selects 
 * to perform the actions that we indicate to the WebDriver. 
 * 
 * It also contains the methods that are used in the test class and implements 
 * the methods it inherits from the base class.
 * 
 */

public class CreateUserPage extends Base {

	By BUTTON_REGISTER = By.xpath("//*[@class='button button--s4 button--t1 header-button header-button--registration']");
	By EMAIL_FIELD = By.id("core__protected_modules_user_yiiForm_RegistrationForm_email");
	By BOX_TYC = By.cssSelector(".form__input--checkbox:nth-child(2) > label");
	By LINK_TYC = By.xpath("//a[@href='/info/terms-of-use']");
	By LINK_DATA_POLICY = By.xpath("//a[@href='/info/privacy-policy']");
	By TYPE_PASSWORD = By.id("core__protected_modules_user_yiiForm_RegistrationForm_password");
	By TYPE_REENTER_PASSWORD = By.id("core__protected_modules_user_yiiForm_RegistrationForm_password_confirmation");
	By ENTER_CODE_CAPTCHA = By.id("core__protected_modules_user_yiiForm_RegistrationForm_captcha");
	By LOGIN = By.id("core__protected_modules_user_yiiForm_RegistrationForm_username");
	By NAME = By.id("core__protected_modules_user_yiiForm_RegistrationForm_name");
	By LAST_NAME = By.id("core__protected_modules_user_yiiForm_RegistrationForm_surname");
	By MIDDLE_NAME = By.id("core__protected_modules_user_yiiForm_RegistrationForm_middle_name");
	By REDEEM_BONUS = By.cssSelector(".special-radio__active > .special-radio__label");
	By TITTLE_BONUS = By.xpath("//*[contains(text(),'Registration Bonus')]");
	By BIRTHDAY1 = By.cssSelector("*[data-test=\"input-birthday\"]");
	By BIRTHDAY2 = By.cssSelector(".datepicker--nav-title");
	By BIRTHDAY3 = By.cssSelector(".datepicker--nav-title");
	By YEAR = By.xpath("//*[@id=\"datepickers-container\"]/div/div/div[3]/div/div[2]");
	By MONTH = By.xpath("//*[@id=\"datepickers-container\"]/div/div/div[2]/div/div[2]");
	By DAY = By.xpath("//*[@id=\"datepickers-container\"]/div/div/div[1]/div[2]/div[18]");
	By NICK_NAME = By.id("core__protected_modules_user_yiiForm_RegistrationForm_nickname");
	By ADDRESS = By.id("core__protected_modules_user_yiiForm_RegistrationForm_address");
	By SELECT_COUNTRY = By.xpath("//span[contains(text(),'Select country')]");
	By DROPDOWN_COUNTRY = By.xpath("//li[contains(text(),'United States of America')]");
	By CITY = By.id("core__protected_modules_user_yiiForm_RegistrationForm_city");
	By POSTAL_CODE = By.id("core__protected_modules_user_yiiForm_RegistrationForm_postcode");
	By GENDER = By.xpath("//span[contains(text(),'Select gender')]");
	By SELECT_GENDER = By.xpath("//li[contains(text(),'Male')]");
	By SECRET_QUESTION = By.xpath("//span[contains(text(),'Secret question')]");
	By SELECT_SECRET_QUESTION = By.xpath("//li[contains(text(),'Your favorite childhood book')]");
	By ANSWER = By.id("core__protected_modules_user_yiiForm_RegistrationForm_secret_answer");
	By REGISTER_SUBMIT = By.xpath("//button[@class='button button--s1 button--t1 ']");
	By ERROR_PASSWORD = By.xpath("//*[contains(text(),'Required 1 digit')]");
	By ERROR_CAPTCHA = By.xpath("//*[contains(text(),'Invalid verification code')]");
	By ERROR_NICKNAME = By.xpath("//*[contains(text(),'Invalid nickname use A-z, 0-9.')]");
	
	DataFileCSV dataFileCSV = new DataFileCSV();

	public CreateUserPage(WebDriver driver) {
		super(driver);
	}

	public void clickBtnRegister() {

		checkIsDisplayed(BUTTON_REGISTER);
		click(BUTTON_REGISTER);
	}
	
	public void typeEmail() {
		checkIsDisplayed(EMAIL_FIELD);
		type(dataFileCSV.getEmail(), EMAIL_FIELD);
	}

	public void clickBoxTyC() {
		checkIsDisplayed(BOX_TYC);
		click(BOX_TYC);
	}
	public void typePassword() {
		checkIsDisplayed(EMAIL_FIELD);
		type(dataFileCSV.getPassword(), TYPE_PASSWORD);
	}
	public void typeReenterPassword() {
		checkIsDisplayed(TYPE_REENTER_PASSWORD);
		type(dataFileCSV.getPassword(), TYPE_REENTER_PASSWORD);
	}

	public void typeCaptcha() {
		checkIsDisplayed(ENTER_CODE_CAPTCHA);
		type("XIPPGUV", ENTER_CODE_CAPTCHA);
	}
	//valor 2
	public void typeLogin() {
		checkIsDisplayed(LOGIN);
		type(dataFileCSV.getLogin(), LOGIN);
	}
	
	public void typeName() {
		checkIsDisplayed(NAME);
		type(dataFileCSV.getName(), NAME);
	}

	public void typeLastName() {
		checkIsDisplayed(LAST_NAME);
		type(dataFileCSV.getLastName(), LAST_NAME);
	}

	public void typeMiddleName() {
		checkIsDisplayed(MIDDLE_NAME);
		type(dataFileCSV.getMiddleName(), MIDDLE_NAME);
	}

	public void cliclRedeemBonus() {
		checkIsDisplayed(REDEEM_BONUS);
		click(REDEEM_BONUS);
	}

	public String titleBonus() {
		return getText(TITTLE_BONUS);
	}

	public void setBirthday() {

		click(BIRTHDAY1);
		click(BIRTHDAY2);
		click(BIRTHDAY3);
		click(YEAR);
		click(MONTH);
		click(DAY);
	}

	public void typeNickName() {
		checkIsDisplayed(NICK_NAME);
		type(dataFileCSV.getNickName(), NICK_NAME);

	}

	public void typeAddress() {
		checkIsDisplayed(ADDRESS);
		type(dataFileCSV.getAddres(), ADDRESS);

	}

	public void dropDownCountrys() throws InterruptedException {
		checkIsDisplayed(SELECT_COUNTRY);
		click(SELECT_COUNTRY);

		checkIsDisplayed(DROPDOWN_COUNTRY);
		click(DROPDOWN_COUNTRY);

	}

	public void typeCity() {
		checkIsDisplayed(CITY);
		type(dataFileCSV.getCity(), CITY);

	}

	public void typePostalCode() {
		checkIsDisplayed(POSTAL_CODE);
		type(dataFileCSV.getPostalCode(), POSTAL_CODE);

	}

	public void selectGender() {
		checkIsDisplayed(GENDER);
		click(GENDER);
		checkIsDisplayed(SELECT_GENDER);
		click(SELECT_GENDER);

	}

	public void secretQuestion() {
		checkIsDisplayed(SECRET_QUESTION);
		click(SECRET_QUESTION);
		checkIsDisplayed(SELECT_SECRET_QUESTION);
		click(SELECT_SECRET_QUESTION);
		checkIsDisplayed(ANSWER);
		type(dataFileCSV.getSecretQuestion(), ANSWER);

	}

	public void submit() {
		checkIsDisplayed(REGISTER_SUBMIT);
		click(REGISTER_SUBMIT);
		
	}

	public String linksTyC() {

		return getText(LINK_TYC);

	}

	public String dataPolicy() {

		WebElement text = findElements(LINK_DATA_POLICY).get(0);
		return text.getText();

	}

	public String cockieDataPolicy() {

		WebElement text = findElements(LINK_DATA_POLICY).get(1);
		return text.getText();

	}
	
	public boolean validatePasswordPostCreateFail() {
		checkIsDisplayed(ERROR_PASSWORD);
		if(getText(ERROR_PASSWORD)!=null) {
			return true;
		} else return false;
	}
	
	public boolean validateErrorCaptchaPostCreateFail() {
		checkIsDisplayed(ERROR_CAPTCHA);
		if(getText(ERROR_CAPTCHA)!=null) {
			return true;
		} else return false;
	}
	
	public boolean validateErrorNickNamePostCreateFail() {
		checkIsDisplayed(ERROR_NICKNAME);
		if(getText(ERROR_NICKNAME)!=null) {
			return true;
		} else return false;
	}

}
