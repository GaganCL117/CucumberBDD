package stepDefinitions;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectPage.LanguageAndRegion;
import reusableComponents.BaseClass;
import utility.ScreenShotClass;

public class TideLanguageAndRegionStepDef extends BaseClass{

	LanguageAndRegion lar;
	ScreenShotClass ssc;
	ExtentTest test;
	
	@Given("^I am in the Tide Home Page$")
	public void i_am_in_the_tide_home_page() {
		lar = new LanguageAndRegion(driver);
		ssc = new ScreenShotClass();
		test = extent.createTest("Testing Languages and Region");
		System.out.println("Tide Home Page Fetched");
	}

	@When("^I clicked on Region Options$")
	public void i_clicked_on_region_options() throws Exception {
		lar.changeLang();
		log.info("Clicked on country name");
		test.pass("Clicked on country name");
		Thread.sleep(1000);
	}

	@Then("^Region or country Selection list should appear$")
	public void region_or_country_selection_list_should_appear() throws Exception {
		lar.selectLang();
		log.info("Selected new Region");
		test.pass("Selected new Region");
	}

	@And("^verify with the selected Region$")
	public void verify_with_the_selected_region() throws Exception {
		ssc.screenshots();
		log.info("Took Screenshot");
		test.pass("Took Screenshot");
		lar.Verify();
		log.info("Validation Pass");
		test.pass("Verification successful");
	}
	
}
