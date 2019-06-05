package search.jombay_search;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import login.jombay_asmt.*;

import pageobject.jombay_search.*;

public class CompaniesPage extends Base {

	@BeforeTest
	void initializeDriver() {
		driver = initialize();

	}

	@Test
	void searchTest() throws InterruptedException

	{

		LoginPage loginObject = new LoginPage();

		loginObject.signinTest();

		CompanySearch serachObject = new CompanySearch(driver);

		serachObject.getcompanyId().sendKeys("3701");
		serachObject.getSearchButton().click();
		Thread.sleep(4000);

		// serachObject.getCompany().click();
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
	}

	@AfterTest
	public void closeTest() {

		driver.quit();
	}
}
