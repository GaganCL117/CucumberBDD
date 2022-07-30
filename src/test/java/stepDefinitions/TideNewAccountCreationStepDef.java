package stepDefinitions;

import java.io.IOException;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectPage.CreateNewAccount;
import objectPage.TideHomePage;
import reusableComponents.BaseClass;
import utility.ScreenShotClass;

public class TideNewAccountCreationStepDef extends BaseClass{

	@Before()
	public void initialization() throws Exception{
		driver = connections();
		ExtentTest test = extent.createTest("Browser Initialization");
		driver.get(prop.getProperty("url"));
		log.info("Browser Launched");
		log.info("Tide URL Fetched");
		test.pass("Browser Launched");
		test.pass("Tide URL Fetched");
		TideHomePage thp = new TideHomePage(driver);
		Thread.sleep(1000);
		thp.waitToCancel();
//		Thread.sleep(2000);
		thp.clickOnElement();
	}
	
	@After
	public void closer() {
		ExtentTest test = extent.createTest("Closing All the active Drivers");
		log.info("Tide Webpage closing");
		log.info("Pushing values to the ExtentReports");
		log.info("Closing Drivers");
		test.pass("Closing WebdDrivers");
		extent.flush();
		driver.quit();
	}
	
	CreateNewAccount cna;
	ExtentTest test;
	ScreenShotClass ssc;
	
	@Given("I have given the Tide URL to check the new user account")
	public void i_have_given_the_tide_url_to_check_the_new_user_account() throws Exception {
		test = extent.createTest("Creating New Tide User Account");
		log.info("Creating New Tide User Account");
		ssc = new ScreenShotClass();
		cna = new CreateNewAccount(driver);
		cna.register();
		log.info("Clicked on Register");
		log.info("Clicked on Signup button");
		test.pass("Clicked on Register");
		test.pass("Clicked on Signup button");
	}

	@When("^I enterd invalid (.+), (.+) and (.+)$")
	public void i_enterd_invalid_johnson123_johnson123_gmail_com_and_johnson(String username, String email, String password) throws Exception {
		cna.username(username);
		log.info("Enterd User Name");
		test.pass("Enterd User Name");
		cna.email(email);
		log.info("Enterd Email");
		test.pass("Enterd Email");
		cna.password(password);
		log.info("Enterd Password");
		test.pass("Enterd Password");
	}

	@And("^clicked on Create Account$")
	public void clicked_on_create_account() throws Exception {
		cna.createAccount();
		log.info("Clicked on Create Account");
		test.pass("Clicked on Create Account");
		Thread.sleep(2000);
	}

	@Then("^user should not be able to create account$")
	public void user_should_not_be_able_to_create_account() throws IOException {
		ssc.screenshots();
		log.info("Took Screenshot");
		test.pass("Took Screenshot");
		log.info("Validation Pass");
		test.pass("Validation Pass");
	}
	
}
