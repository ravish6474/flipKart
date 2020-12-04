package com.flipkart.testCases;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.flipkart.pageObjects.HomePage;

public class TC_ResultsValidation_002 extends BaseClass {

	@Test(priority=0)
	public void searchResultNameValidation() throws InterruptedException {

		HomePage homePage = new HomePage(driver);

		logger.info("User is navigated to HomePage");
		//homePage.waitforElement(homePage.searchMobiles);
		Thread.sleep(2000);
		homePage.clicksearchMobiles();
		homePage.enterSearchText("mobiles");
		homePage.clickSearch();
		homePage.clickRAM();
		homePage.enterBrand("Gionee");
		homePage.selectBrand();
		//homePage.waitforElement(homePage.resultText);
		Thread.sleep(2000);
		logger.info("User is validating the brand name details in the results");
		Assert.assertTrue(homePage.validateNameResultList("Gionee"));

	}

	@Test(priority =1)
	public void searchResultRAMValidation() throws InterruptedException {

		HomePage homePage = new HomePage(driver);
		logger.info("User validating the RAM details in the results");
		Assert.assertTrue(homePage.validateRAMResultList("2 GB"));
		logger.info("User is clearing all the filters");
		Thread.sleep(2000);
		homePage.clearFilters();
	}

}
