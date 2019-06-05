package pageobject.jombay_search;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompanySearch {
	public WebDriver driver;

	public CompanySearch(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "search_id")
	WebElement companyId;

	@FindBy(xpath = "//input[@type='submit']")
	WebElement submit;

	@FindBy(xpath = "//a[text()='3701']")
	WebElement company;

	public WebElement getcompanyId() {
		return companyId;

	}

	public WebElement getSearchButton() {
		return submit;

	}

	public WebElement getCompany() {
		return company;

	}
}
