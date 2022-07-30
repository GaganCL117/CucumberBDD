package stepDefinitions;

import java.io.IOException;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectPage.TideStainRemoval;
import reusableComponents.BaseClass;
import utility.ScreenShotClass;

public class TideStainRemovalStepDef extends BaseClass{

	TideStainRemoval tsr;
	ScreenShotClass ssc;
	ExtentTest test;
	
	@Given("I am at Tide Home page hovered on Shop Products")
	public void i_am_at_tide_home_page_hovered_on_shop_products() throws Exception {
		tsr = new TideStainRemoval(driver);
		ssc = new ScreenShotClass();
		test = extent.createTest("Check for Stain Removal");
		tsr.moveToShopProducts();
		log.info("Hoverd on Shop Products");
		test.pass("Hoverd on Shop Products");
	}

	@When("I clicked on Stain Removal Option")
	public void i_clicked_on_stain_removal_option() throws Exception {
		tsr.clickOnStainRemoval();
		log.info("Clicked on Stain Removal option");
		test.pass("Clicked on Stain Removal option");
	}

	@Then("I should be able to navigate to stain Removal page")
	public void i_should_be_able_to_navigate_to_stain_removal_page() throws IOException {
		System.out.println("Navigated to Stain Removal page");
		ssc.screenshots();
		log.info("Took Screenshot");
		test.pass("Took Screenshot");
	}

	@And("Verify weather Stain Removal Page is visible or not")
	public void verify_weather_stain_removal_page_is_visible_or_not() throws Exception {
		tsr.verify();
		tsr.verify();
		log.info("Validation Pass");
		test.pass("Verification successful");
	}
	
}
