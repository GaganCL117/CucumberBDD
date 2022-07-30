package stepDefinitions;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectPage.TideLaundry;
import reusableComponents.BaseClass;
import utility.ScreenShotClass;

public class TideLaundryStepDef extends BaseClass{

	TideLaundry tl;
	ScreenShotClass ssc;
	ExtentTest test;
	
	@Given("I am in the home page of Tide website")
	public void i_am_in_the_home_page_of_tide_website() {
		ssc = new ScreenShotClass();
		test = extent.createTest("Check for Tide Laundry");
		System.out.println("I have navigated to Tide Home page");
	}

	@When("I hovered on How To Wash Cloths")
	public void i_hovered_on_how_to_wash_cloths() throws Exception {
		tl = new TideLaundry(driver);
		tl.moveToHowToWashCloths();
		log.info("Hoverd on How TO Wash CLothes");
		test.pass("Hoverd on How TO Wash CLothes");
		
	}

	@And("Clicked on Tide Laundry")
	public void clicked_on_tide_laundry() throws Exception {
		tl.clickOnLaundry();
		log.info("Clicked on Laundry option");
		test.pass("Clicked on Laundry option");
		Thread.sleep(2000);
	}

	@Then("Verify with the Laundry page is visible or not")
	public void verify_with_the_laundry_page_is_visible_or_not() throws Exception {
		ssc.screenshots();
		log.info("Took Screenshot");
		test.pass("Took Screenshot");
		tl.verify();
		log.info("Validation Pass");
		test.pass("Verification successful");
	}
	
}
