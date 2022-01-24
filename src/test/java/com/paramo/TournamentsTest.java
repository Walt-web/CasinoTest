package com.paramo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import junit.framework.Assert;

/*
 * In this class we use selenium properties that execute the automatic test. 
 * We make assertions and invocations to methods of the page class 
 * that we use by creating an instance of the page object.
 * 
 */

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

	/*
	 * We login with a valid user and enter the tournaments option validating
	 * existing elements when entering.
	 */

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
