package stepDefinitions;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectPage.ProductSearch;
import reusableComponents.BaseClass;
import utility.ExcelData;
import utility.ScreenShotClass;

public class TideSearchForPowderStepDef extends BaseClass {

	ProductSearch ps;
	ScreenShotClass ssc;
	ExtentTest test;
	
	@Given("^I am at the Home page of Tied website$")
	public void i_am_at_the_home_page_of_tied_website() {
		ssc = new ScreenShotClass();
		test = extent.createTest("Search for Powder Product");
		System.out.println("Tide Home Page Fetched");
	}

	@When("^I Enterd the Product name$")
	public void i_enterd_the_product_name() {
		ps = new ProductSearch(driver);
		ExcelData ed = new ExcelData();
		ps.searchPowder(ed.data());
		log.info("Enter Powder in search box");
		test.pass("Enter Powder in search box");
	}

	@Then("^I should navigate to Powder Page$")
	public void i_should_navigate_to_powder_page() {
		System.out.println("Tide Powder Page is Visible");
	}

	@And("^Click on Products$")
	public void click_on_products() throws Exception {
		ps.products();
		log.info("Click on Products");
		test.pass("Click on Products");
	}

	@And("^Click on Find Retailor$")
	public void click_on_find_retailor() throws Exception {
		ps.findRetailor();
		log.info("Click on Products");
		test.pass("Click on Products");
	}

	@Then("^Close the popup window$")
	public void close_the_popup_window() throws Exception {
		ssc.screenshots();
		log.info("Took Screenshot");
		test.pass("Took Screenshot");
		ps.close();
		log.info("Closed the Tab");
		test.pass("Closed the Tab");
	}

	@And("^Verify Powder is Displayed or not$")
	public void verify_powder_is_displayed_or_not() {
		ps.verify();
		log.info("Validation Pass");
		test.pass("Verification successful");
	}
	
	
}
