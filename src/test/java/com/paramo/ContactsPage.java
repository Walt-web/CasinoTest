package com.paramo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

	

public class ContactsPage extends Base {
	
	By MORE = By.xpath("//span[@class='header-menu-main__item-link menu-dd__button']");
	By CONTACS_OPTIONS = By.xpath("//*[@class='header-menu-main__item-link' and @href='/site/help']");

	public ContactsPage(WebDriver driver) {
		super(driver);
	}
	
	public void clickMore() {

		checkIsDisplayed(MORE);
		click(MORE);
	}
	
	public void clickContacsOptions() {

		checkIsDisplayed(CONTACS_OPTIONS);
		click(CONTACS_OPTIONS);
	}

}
