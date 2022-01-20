package com.paramo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class ContactsTest {

	WebDriver driver;

	
	ContactsPage contactsPage;

	@Before
	public void setUp() throws Exception {
		
		contactsPage = new ContactsPage(driver);
		driver = contactsPage.chromeDriverConnection();
		contactsPage.visit("https://demo.casino/");
		driver.manage().window().maximize();
	}

	@After
	public void tearDown() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}
	
	@Test
	public void contacts() {
		
		contactsPage.clickMore();
		contactsPage.clickContacsOptions();
		
	}

}
