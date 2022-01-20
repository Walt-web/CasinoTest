package com.paramo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class TournamentsTest {

	WebDriver driver;

	
	TournamentsPage contactsPage;

	@Before
	public void setUp() throws Exception {
		
		contactsPage = new TournamentsPage(driver);
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
		
		contactsPage.signIn();
		contactsPage.tournaments();
		
	}

}
