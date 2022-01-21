package com.paramo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import junit.framework.Assert;

public class TournamentsTest {

	WebDriver driver;

	
	TournamentsPage tournamentsPage;

	@Before
	public void setUp() throws Exception {
		
		tournamentsPage = new TournamentsPage(driver);
		driver = tournamentsPage.chromeDriverConnection();
		tournamentsPage.visit("https://demo.casino/");
		driver.manage().window().maximize();
	}

	@After
	public void tearDown() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}
	
	@Test
	public void contacts() {
		
		tournamentsPage.signIn();
		tournamentsPage.tournaments();
		Assert.assertEquals("All", tournamentsPage.optionTournamensAll());
		Assert.assertEquals("Pending", tournamentsPage.optionTournamensPending());
		Assert.assertEquals("Active", tournamentsPage.optionTournamensActive());
		Assert.assertEquals("Finished", tournamentsPage.optionTournamensFinished());
		Assert.assertEquals("Subscribed", tournamentsPage.optionTournamenSubscribe());
		Assert.assertEquals("Canceled", tournamentsPage.optionTournamensCanceled());
		

	}

}
