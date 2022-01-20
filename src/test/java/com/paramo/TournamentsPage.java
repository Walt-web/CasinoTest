package com.paramo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

	

public class TournamentsPage extends Base {
	
	//By MORE = By.xpath("//span[@class='header-menu-main__item-link menu-dd__button']");
	
	
	By SIGN = By.xpath("//*[contains(text(),'Sign in')]");
	By USER = By.id("UserLogin_username");
	By PASSWORD = By.id("UserLogin_password");
	By SUBMIT = By.xpath("//button[@class='button button--s1 button--t1 ']");
	By MENU = By.xpath("//i[@class='icon-mobile-menu']");
	By SELECT_TOURNAMENTS = By.xpath("//*[@class='quick-links-menu__item-link ' and @href='/tournaments/tournaments/getAll']");

	public TournamentsPage(WebDriver driver) {
		super(driver);
	}
	
	public void signIn() {

		checkIsDisplayed(SIGN);
		click(SIGN);
		checkIsDisplayed(USER);
		type("john2020",USER);
		type("MyPassword1",PASSWORD);
		checkIsDisplayed(SUBMIT);
		click(SUBMIT);
		
	}
	
	public void tournaments() {

		checkIsDisplayed(MENU);
		click(MENU);
		checkIsDisplayed(SELECT_TOURNAMENTS);
		click(SELECT_TOURNAMENTS);
	}

}
