package stepDefinitions;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectPage.TideInSpace;
import reusableComponents.BaseClass;
import utility.ScreenShotClass;

public class TideInSpaceStepDef extends BaseClass{

	TideInSpace tis;
	ScreenShotClass ssc;
	ExtentTest test;
	
	@Given("I am in the Tide Home page")
	public void i_am_in_the_tide_home_page() {
		ssc = new ScreenShotClass();
		test = extent.createTest("Check for Tide In Space");
		System.out.println("Navigated to Tide Home Page");
	}

	@When("I hovered on Our Commitments")
	public void i_hovered_on_our_commitments() throws Exception {
		tis = new TideInSpace(driver);
		tis.moveToOurCommitment();
		log.info("Hoverd on Our Commitments feature");
		test.pass("Hoverd on Our Commitments feature");
	}

	@And("Clicked on Tide in Space Option")
	public void clicked_on_tide_in_space_option() throws Exception {
		tis.clickOnTideInSpace();
		log.info("Clicked on Tide In Space Option");
		test.pass("Clicked on Tide In Space Option");
		Thread.sleep(2000);
	}

	@Then("Verify whether Tide in space is displayed or not")
	public void verify_whether_tide_in_space_is_displayed_or_not() throws Exception {
		ssc.screenshots();
		log.info("Took Screenshot");
		test.pass("Took Screenshot");
		tis.verify();
		log.info("Validation Pass");
		test.pass("Verification successful");
	}
	
}
