package stepDefinitions;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectPage.LiveChat;
import reusableComponents.BaseClass;
import utility.ScreenShotClass;

public class TideLiveChatStepDef extends BaseClass{

	LiveChat lc;
	ScreenShotClass ssc;
	ExtentTest test;
	
	@Given("^I am at Tide home page$")
	public void i_am_at_tide_home_page() throws Exception {
		ssc = new ScreenShotClass();
		test = extent.createTest("Test Live Chat Feature");
		lc = new LiveChat(driver);
	}

	@When("^I clicked on LiveChat option$")
	public void i_clicked_on_liveChat_option() throws Exception {
		lc.liveChat();
		log.info("Clicked on Live Chat");
		test.pass("Clicked on Live Chat");
		Thread.sleep(1000);
	}

	@Then("^I should Navigate to the Tide LiveChat page$")
	public void i_should_navigate_to_the_tide_liveChat_page() throws Exception {
		lc.scrollBack();
		log.info("Navigated Back");
		test.pass("Navigated Back");
	}
	
	@And("^Verify whether Live Chat is present or not$")
	public void verify_whether_live_chat_is_present_or_not() throws Exception {
		ssc.screenshots();
		log.info("Took Screenshot");
		test.pass("Took Screenshot");
		lc.verify();
		log.info("Validation Pass");
		test.pass("Verification successful");
	}
	
}
