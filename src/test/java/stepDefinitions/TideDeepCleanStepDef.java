package stepDefinitions;

import java.io.IOException;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectPage.TideDeepClean;
import reusableComponents.BaseClass;
import utility.ScreenShotClass;

public class TideDeepCleanStepDef extends BaseClass{

	TideDeepClean tdc;
	ScreenShotClass ssc;
	ExtentTest test;
	
	@Given("I am in the Home page of Tide website")
	public void i_am_in_the_home_page_of_tide_website() {
		ssc = new ScreenShotClass();
		test = extent.createTest("Check for Tide Deep Clean");
		System.out.println("Navigated to Tide Home Page");
	}

	@When("I hovered on Shop products")
	public void i_hovered_on_shop_products() throws Exception {
		tdc = new TideDeepClean(driver);
		tdc.moveToShopProducts();
		log.info("Hoverd on Shop Products feature");
		test.pass("Hoverd on Shop Products feature");
	}

	@And("Clicked on Tide Deep Clean")
	public void clicked_on_tide_deep_clean() throws Exception {
		tdc.clickOnDeepClean();
		log.info("Clicked on Deep Clean Option");
		test.pass("Clicked on Deep Clean Option");
		Thread.sleep(2000);
	}
	
	@When("^changed the alphabetical order to (.+)$")
	public void changed_the_alphabetical_order_to_title_za(String value) {
		tdc.selectType(value);
		log.info("Selected A-Z alphabetic Filture");
		test.pass("Selected A-Z alphabetic Filture");
	}

	@Then("verify all the changes are correct or not")
	public void verify_all_the_changes_are_correct_or_not() throws IOException {
		ssc.screenshots();
		log.info("Validation Pass");
		test.pass("Verification successful");
		tdc.verify();
		log.info("Validation Pass");
		test.pass("Verification successful");
	}
	
}
